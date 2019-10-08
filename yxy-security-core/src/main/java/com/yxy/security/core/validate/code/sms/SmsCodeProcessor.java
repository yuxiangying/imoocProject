package com.yxy.security.core.validate.code.sms;

import com.yxy.security.core.validate.code.ValidateCode;
import com.yxy.security.core.validate.code.impl.AbstractValidateCodeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.ServletRequest;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: SmsCodeProcessor
 * @Description:TODO(短信验证码处理器)
 * @date: 2019年09月30日 10:24
 **/
@Component("smsValidateCodeProcessor")
public class SmsCodeProcessor extends AbstractValidateCodeProcessor<ValidateCode> {
    //短信验证码发送器
    @Autowired
    private SmsCodeSender smsCodeSender;

    @Override
    protected void send(ServletWebRequest request, ValidateCode validateCode) throws Exception {
//        String mobile1 = ServletRequestUtils.getRequiredStringParameter((ServletRequest) request,"mobile");
        //		String mobile= ServletRequestUtils.getStringParameter((ServletRequest) request, "mobile");
//		String mobile= ServletRequestUtils.getRequiredStringParameter((ServletRequest)request,"mobile");
        String mobile= ServletRequestUtils.getRequiredStringParameter(request.getRequest(),"mobile");
        smsCodeSender.send(mobile,validateCode.getCode());
    }
}
