package com.citrsw.apiexample.configuation;

import com.citrsw.apiexample.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 *
 * @author Zhenfeng Li
 * @date 2020-01-07 15:15:11
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private final LoginInterceptor loginInterceptor;

    public InterceptorConfig(LoginInterceptor loginInterceptor) {
        this.loginInterceptor = loginInterceptor;
    }

    /**
     * 放行API
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/citrsw/**").addResourceLocations("classpath:/citrsw/");
    }

    /**
     * 配置拦截器执行顺序
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // 默认全部拦截
        // addPathPatterns 添加拦截
        // excludePathPatterns 排除拦截
        //登录拦截器
        registry.addInterceptor(loginInterceptor)
                //需要拦截的uri
                .addPathPatterns("/**")
                //需要跳过的uri
                .excludePathPatterns("/citrsw/**", "/login", "/logout")
                //拦截器的执行顺序
                .order(1);
    }
}