package com.citrsw.apiexample.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录拦截器
 *
 * @author Zhenfeng Li
 * @version 1.0.0
 * @date 2020-02-19 16:47:31
 */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {


    public LoginInterceptor() {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        return false;
    }
}
