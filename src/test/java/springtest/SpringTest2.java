/*
 * 文件名：SpringTest2.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月10日
 */

package springtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ex02.ArithmeticCalculator;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:aop/spring.*.xml")

public class SpringTest2
{
    private static final Logger LOGGER = LogManager.getLogger(SpringTest2.class);
    
    @Autowired
    private ArithmeticCalculator aci;
    
    @Test
    public void test()
    {
        LOGGER.info("================================================");
        aci.add(1, 1);
    }
}
