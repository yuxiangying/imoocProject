package com.yxy.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: VaildateCodeException
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年09月25日 14:08
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public class ValidateCodeException extends AuthenticationException {

    private static final long serialVersionUID = -6708479908827648670L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
