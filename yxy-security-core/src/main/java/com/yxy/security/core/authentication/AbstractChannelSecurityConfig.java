package com.yxy.security.core.authentication;

import com.yxy.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: AbstractChannelSecurityConfig
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年10月08日 15:00
 **/
public class AbstractChannelSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected AuthenticationSuccessHandler yxyAuthenticationSuccessHandler;

    @Autowired
    protected AuthenticationFailureHandler yxyAuthenticationFailureHandler;

    protected void applyPasswordAuthenticationConfig(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
                .loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM)
                .successHandler(yxyAuthenticationSuccessHandler)
                .failureHandler(yxyAuthenticationFailureHandler);
    }

}
