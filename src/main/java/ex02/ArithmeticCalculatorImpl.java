/*
 * 文件名：ArithmeticClaculatorImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月9日
 */

package ex02;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator
{

    @Override
    public void add(int i, int j)
    {
       System.out.println("日志：The method add begins with [" + i + ", " + j + "]");
       int result = i + j;
       System.out.println("result:" + result);
       System.out.println("日志： The method add ends with " + result);
    }

    @Override
    public void sub(int i, int j)
    {
        System.out.println("日志：The method add begins with [" + i + ", " + j + "]");
        int result = i - j;
        System.out.println("result:" + result);
        System.out.println("日志： The method add ends with " + result);  
    }

}
