/*
 * 文件名：CalcValidationHandler.java 版权：Copyright by www.cheer.com 描述： 修改人：JuliusRandle
 * 修改时间：2017年11月9日
 */

package spring.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class CalcValidationHandler implements InvocationHandler
{

    private Object target;

    public CalcValidationHandler(Object target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        for (Object arg : args)
        {
            validate((int)arg);
        }

        Object result = method.invoke(target, args);
        
        return result;
    }

    public static Object createProxy(Object target)
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
            target.getClass().getInterfaces(), new CalcValidationHandler(target));
    }

    private void validate(int a)
    {
        if (a < 0)
        {
            throw new IllegalArgumentException("Postive numbers only");
        }
    }
}
