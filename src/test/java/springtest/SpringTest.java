package springtest;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex01.Container;
import ex01.ReportService;
import spring.MessagePrinter;
import spring.MessageService;


/*
 * 文件名：SpringTest.java 版权：Copyright by www.cheer.com 描述： 修改人：JuliusRandle 修改时间：2017年11月7日
 */

public class SpringTest
{
    @Test
    public void testIoc()
    {
        Container container = new Container();
        ReportService reportService = (ReportService)container.getComponent("reportService");
        Assert.assertNotNull(reportService);
        reportService.generateMonthlyReport();
    }
    
    @Test
    public void testOldStyle()
    {
        MessageService msgService = new MessageService();
        MessagePrinter msgPrinter = new MessagePrinter();

        // 注入msgService对象
        msgPrinter.setMsgService(msgService);

        msgPrinter.printMessage();
    }

    @SuppressWarnings("resource")
    @Test
    public void testSpringStyle()
    {
        // ------------Spring特性 IOC DI(Dependency Injection) 依赖注入
        // ------------Spring的beans工厂帮助我们创建对象（通过反射的方式Class.forName("")）
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.beans.xml");
        MessagePrinter msgPrinter = context.getBean(MessagePrinter.class);
        msgPrinter.printMessage();
    }
}
