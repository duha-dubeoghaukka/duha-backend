package com.innocamp.dduha.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowedOrigins("http://localhost:3000", "https://dduha.site/")
                .exposedHeaders("Authorization")
                // 내 서버가 응답할 때 json을 자바스크립트에서 처리할 수 있게 할지를 설정하는 것. false로 하면 자바스크립트로 요청했을때 오지 않음.
                .allowCredentials(true);
    }
}
