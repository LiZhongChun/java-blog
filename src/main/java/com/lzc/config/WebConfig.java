package com.lzc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author shkstart
 * @create 2021-08-13-12:34
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //访问我什么东西允许跨域
        registry.addMapping("/**")
                //跨域的来源
                .allowedOrigins("http://localhost:8080","null")
                //方法
                .allowedMethods("GET","POST","PUT","OPTION","DELETE")
                //允许是否携带信息
                .allowCredentials(true)
                .maxAge(3600);
    }
}
