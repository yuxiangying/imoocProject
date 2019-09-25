package com.yxy.security.core.properties;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: BrowserProperties
 * @Description:TODO(浏览器参数配置文件)
 * @date: 2019年08月27日 10:19
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public class BrowserProperties {
    private String loginPage = "/login.html";

    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
