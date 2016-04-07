package kz.tezdet.lessons.springmvc.interceptors;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("GreetingInterseptor: REQUEST Intercepted for URI: " +
        request.getRequestURI());
        request.setAttribute("greeting", "Happy Daulet!");

        return true ;
    }
}
