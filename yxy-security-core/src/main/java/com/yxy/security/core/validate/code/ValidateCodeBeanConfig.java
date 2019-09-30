package com.yxy.security.core.validate.code;

import com.yxy.security.core.properties.SecurityProperties;
import com.yxy.security.core.validate.code.image.ImageCodeGenerator;
import com.yxy.security.core.validate.code.sms.DefaultSmsCodeSender;
import com.yxy.security.core.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: ValidateCodeBeanConfig
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年09月25日 16:50
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
@Configuration
public class ValidateCodeBeanConfig {
    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    public ValidateCodeGenerator imageCodeGenerator(){//方法的名字就是spring容器中bean的名字
        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
        codeGenerator.setSecurityProperties(securityProperties);
        return codeGenerator;
    }

    @Bean
    @ConditionalOnMissingBean(SmsCodeSender.class)//当容器中找到了SmsCodeSender的实现就不会再用此实现bean
    public SmsCodeSender smsCodeSender(){//方法的名字就是spring容器中bean的名字
        //此处省略生成器过程
        return new DefaultSmsCodeSender();
    }
}
