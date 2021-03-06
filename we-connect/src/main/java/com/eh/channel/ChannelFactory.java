package com.eh.channel;

import com.eh.channel.wechat.WechatmMessageFactory;
import com.eh.enums.Channel;
import com.eh.model.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David Li on 2015/12/3.
 */
public class ChannelFactory {
    private static Map<Channel, ChannelMessageFactory> messageFactoryMap = new HashMap<Channel, ChannelMessageFactory>();

    static {
        messageFactoryMap.put(Channel.WEIXIN, new WechatmMessageFactory());
    }

    public static ChannelMessageFactory getMessageFactory(Channel channel) {
        return messageFactoryMap.get(channel);
    }

    public static ChannelMessageFactory getMessageFactory(Account account) {
        return messageFactoryMap.get(account.getChannel());
    }
}
