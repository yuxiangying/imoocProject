package com.yxy.security.core;

import com.yxy.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: SecurityCoreConfig
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年08月27日 10:35
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
