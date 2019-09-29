package com.yxy.security.core.validate.code.sms;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: DefaultSmsCodeSender
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年09月29日 17:01
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机"+mobile+"发送短信验证码"+code);
    }
}
