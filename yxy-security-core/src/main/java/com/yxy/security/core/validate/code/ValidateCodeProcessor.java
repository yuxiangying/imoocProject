package com.yxy.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/*
 *@Title:
 * @Author 余想英
 * @Description: TODO(校验码处理器，封装不同校验码的处理逻辑)
 */
public interface ValidateCodeProcessor {

    /**
     *验证码放入session时的前缀
     */
    String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";

    /*
     * @Author 余想英
     * @Description: TODO(创建校验码)
     * @param: [request]
     */
    void create(ServletWebRequest request) throws Exception;
    
}
