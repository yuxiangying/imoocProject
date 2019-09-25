package com.yxy.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: SecurityProperties
 * @Description:TODO(安全配置文件)
 * @date: 2019年08月27日 10:22
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
@ConfigurationProperties(prefix = "yxy.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }
}
