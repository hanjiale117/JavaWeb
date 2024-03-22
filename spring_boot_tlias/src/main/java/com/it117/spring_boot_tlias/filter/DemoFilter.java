//package com.it117.spring_boot_tlias.filter;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//
//import java.io.IOException;
//
//
//@WebFilter(urlPatterns = "/*")  // /*代表拦截所有请求
//public class DemoFilter implements Filter {
//    // 默认实现destroy和init
//    /**
//     * default void init(FilterConfig filterConfig) throws ServletException {}
//     * default默认实现这个方法
//     */
//    @Override
//    //初始化方法 只会调用一次方法
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("init 初始化方法执行");
//    }
//
//    @Override
//    //拦截到请求之后调用 会调用多次
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("Demo拦截前的逻辑");
//        //只进行拦截了 需要我们进行放行
//        filterChain.doFilter(servletRequest, servletResponse);
//        System.out.println("Demo拦截后的逻辑");
//    }
//
//    //销毁方法 也只会调用一次方法
//    @Override
//    public void destroy() {
//        System.out.println("destroy 初始化方法执行");
//    }
//}
