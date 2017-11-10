/*
 * 文件名：CalcLoggingAspect.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月10日
 */

package ex02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalcLoggingAspect
{
    private static final Logger LOGGER = LogManager.getLogger(CalcLoggingAspect.class);
    
    // 注解表示该方法为前置通知
    // 注解里配置的内容是切点表达式 
    // 第一个*表示任意的修饰符或者方法返回值类型
    // .. 表示匹配方法任意数量的参数
    @Before("execution(*Calc.add(...))")
    public void logBefore()
    {
        LOGGER.info("The method add() begins");
    }
}
