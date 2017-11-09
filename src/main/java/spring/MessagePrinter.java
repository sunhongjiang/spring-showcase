/*
 * 文件名：MessagePrinter.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月7日
 */

package spring;

import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessagePrinter
{
    private static final Logger LOGGER = LogManager.getLogger(MessagePrinter.class);

    private MessageService msgService;

    public MessagePrinter()
    {
        LOGGER.info("MessagePrinter() is invoked.");
    }

    public void setMsgService(MessageService msgService)
    {
        this.msgService = msgService;
    }

    public void printMessage()
    {
        System.out.println(this.msgService.getMessage());
        
        for (String msg : this.msgService.getMsgs())
        {
            System.out.println(msg);
        }

        for (Entry<String, String> entry : this.msgService.getConfig().entrySet())
        {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
