package com.yxy.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: ValidateCodeGenerator
 * @Description:TODO(验证码的生成器)
 * @date: 2019年09月25日 16:37
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);
}
