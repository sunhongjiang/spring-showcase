/*
 * 文件名：TestAop.java 版权：Copyright by www.cheer.com 描述： 修改人：JuliusRandle 修改时间：2017年11月9日
 */

package springtest;


import org.junit.Test;

import spring.aop.ArithmeticCalculator;
import spring.aop.ArithmeticCalculatorImpl;
import spring.aop.CalcLoggingHandler;
import spring.aop.CalcValidationHandler;


public class TestAop
{
    @Test
    public void test()
    {
        ArithmeticCalculator arithmeticCalculatorImpl = new ArithmeticCalculatorImpl();

        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator)CalcValidationHandler.createProxy(
            CalcLoggingHandler.createProxy(arithmeticCalculatorImpl));

        arithmeticCalculator.add(12, 13);
    }
}
