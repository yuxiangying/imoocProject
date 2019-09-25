package com.yxy.code;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.yxy.security.core.validate.code.ImageCode;
import com.yxy.security.core.validate.code.ValidateCodeGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: DemoImageCodeGenerator
 * @Description:TODO(自定义图形验证码生成器，@Component("imageCodeGenerator")有这个就把模板里的验证码生成器覆盖)
 * @date: 2019年09月25日 17:04
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("更高级的图形验证码生成器");
        return null;
    }
}
