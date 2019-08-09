package com.zhiyou.security.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: http://wangjie
 * @Date: 2019/7/22
 * @Description: com.wj.security.core.properties
 * 使SecurityCoreConfig生效
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
