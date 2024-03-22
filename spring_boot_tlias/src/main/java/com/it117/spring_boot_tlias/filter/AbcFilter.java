//package com.it117.spring_boot_tlias.filter;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//
//import java.io.IOException;
//@WebFilter("/*")
//public class AbcFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("ABC拦截到了请求");
//
//        filterChain.doFilter(servletRequest, servletResponse);
//        //如果这个第一个过滤器 那么这个放行就会放行到下一个过滤器
//        //直到这个过滤器是最后一个过滤器 才会放行到web资源上
//        //注解配置的Filter,优先级是按照过滤器类名(字符串)的自然排序
//
//        System.out.println("ABC拦截后的逻辑");
//
//        //ABC拦截到了请求
//        //Demo拦截前的逻辑
//        //Demo拦截后的逻辑
//        //ABC拦截后的逻辑
//    }
//}
