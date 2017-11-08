/*
 * 文件名：MessagePrinter.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月7日
 */

package spring;

public class MessagePrinter
{
    private MessageService msgService;

    public void setMsgService (MessageService msgService)
    {
        this.msgService = msgService;
    }
    
    public void printMessage()
    {
        System.out.println(this.msgService.getMessage());
    }
}
