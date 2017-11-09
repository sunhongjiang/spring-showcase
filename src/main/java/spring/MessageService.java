/*
 * 文件名：MessageService.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月7日
 */

package spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService
{
    private String message;

    private List<String> msgs = new ArrayList<>();

    private Map<String, String> config = new HashMap<>();

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public List<String> getMsgs()
    {
        return msgs;
    }

    public void setMsgs(List<String> msgs)
    {
        this.msgs = msgs;
    }

    public Map<String, String> getConfig()
    {
        return config;
    }

    public void setConfig(Map<String, String> config)
    {
        this.config = config;
    }

}
