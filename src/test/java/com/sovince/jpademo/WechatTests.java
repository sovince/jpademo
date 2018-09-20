package com.sovince.jpademo;

import com.sovince.jpademo.config.WechatConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatTests {
    @Autowired
    private WechatConfig wechatConfig;

    @Test
    public void test(){
        String appId = wechatConfig.getAppId();
        String secret = wechatConfig.getSecret();

        System.out.println("appId:"+appId);
        System.out.println("secret:"+secret);
    }
}
