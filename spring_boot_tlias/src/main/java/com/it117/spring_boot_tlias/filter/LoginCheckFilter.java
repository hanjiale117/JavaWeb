//package com.it117.spring_boot_tlias.filter;
//
//import com.alibaba.fastjson.JSONObject;
//import com.it117.spring_boot_tlias.pojo.Result;
//import com.it117.spring_boot_tlias.utils.JwtUtils;
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.util.StringUtils;
//
//import java.io.IOException;
//
//@Slf4j
//@WebFilter(urlPatterns = "/*")
//public class LoginCheckFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        //1.获取URL
//        //servletRequest获取请求参数
//        //servletResponse响应结果
//        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//        //得到了请求对象和请求响应
//
//        //得到URL
//        String url = httpServletRequest.getRequestURL().toString();
//        System.out.println(url);
//
//        //2.判断url是否包含login
//        //如果包含说明是登录请求 直接放行
//        if(url.contains("login")){
//            log.info("登录操作,放行...");
//            filterChain.doFilter(servletRequest, servletResponse);
//            return;
//        }
//        //3.获取请求头中 的令牌(token)
//        //请求头为token
//        String jwt = httpServletRequest.getHeader("token");
//
//        //4.判断令牌是否存在
//        if(!StringUtils.hasLength(jwt)){
//            //hasLength代表这个字符串是否有长度
//            //如果为null或者为空 则进入到这个语句中
//            log.info("请求头token为空,返回未登录的信息");
//            Result error = Result.error("NOT_LOGIN"); //前端只要接受到这个NOT_LOGIN 就强制跳转到登录页面
//            //手动转换 为JSON格式
//            //使用alibaba的工具包
//            String jsonString = JSONObject.toJSONString(error);
//
//            //响应给浏览器
//            httpServletResponse.getWriter().write(jsonString);
//            return; //否则代码会继续执行
//        }
//
//        //5.校验jwt令牌
//        try {
//            JwtUtils.parseJWT(jwt);
//        } catch (Exception e) {
//            e.printStackTrace();
//            //只要报错 说明令牌是非法的
//            log.info("解析令牌失败");
//            Result error = Result.error("NOT_LOGIN");
//            //手动转换 为JSON格式
//            //使用alibaba的工具包
//            String jsonString = JSONObject.toJSONString(error);
//
//            //响应给浏览器
//            httpServletResponse.getWriter().write(jsonString);
//            return; //否则代码会继续执行
//        }
//        //6.解析.令牌成功 直接放行
//        log.info("令牌合法");
//        filterChain.doFilter(servletRequest, servletResponse);
//
//    }
//}
