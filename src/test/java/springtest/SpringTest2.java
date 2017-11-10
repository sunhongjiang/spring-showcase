/*
 * 文件名：SpringTest2.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月10日
 */

package springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ex02.ArithmeticCalculatorImpl;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:aop/spring.*.xml")

public class SpringTest2
{
    @Autowired
    private ArithmeticCalculatorImpl aci;
    
    @Test
    public void test()
    {
        aci.add(1, 1);
    }
}
