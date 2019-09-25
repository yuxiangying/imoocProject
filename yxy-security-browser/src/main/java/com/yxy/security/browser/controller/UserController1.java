package com.yxy.security.browser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: UserController
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年08月26日 15:32
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
@RestController
public class UserController1 {
    @GetMapping("/helloby")
    public String helloby() {
        return "hello word1！";
    }
}
