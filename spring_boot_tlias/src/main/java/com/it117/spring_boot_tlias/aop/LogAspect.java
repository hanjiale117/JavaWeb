package com.it117.spring_boot_tlias.aop;

import com.alibaba.fastjson.JSONObject;
import com.it117.spring_boot_tlias.mapper.OperateLogMapper;
import com.it117.spring_boot_tlias.pojo.OperateLog;
import com.it117.spring_boot_tlias.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Aspect
@Slf4j
@Component
public class LogAspect {


    @Autowired
    private OperateLogMapper operateLogMapper;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Around("@annotation(com.it117.spring_boot_tlias.anno.anno.Log)")
    public Object recordLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 调用原始目标
        long start = System.currentTimeMillis();
        Object object = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();


        // 操作人的ID
        // 请求人的JWT令牌
        String jwt = httpServletRequest.getHeader("token");// 获取JWT令牌

        Claims claims = JwtUtils.parseJWT(jwt);
        Integer id = (Integer) claims.get("id");

        // 操作时间
        LocalDateTime operateTime = LocalDateTime.now();

        // 操作类名
        String className = proceedingJoinPoint.getTarget().getClass().getName();

        // 操作方法名
        String methodName = proceedingJoinPoint.getSignature().getName();

        // 操作方法的参数
        Object[] args = proceedingJoinPoint.getArgs();// 数组
        String methodParams = Arrays.toString(args);

        // 方法执行的返回值
        String returnValue = JSONObject.toJSONString(object);

        // 操作耗时
        Long costTime = end -start;

        // 记录日志
        OperateLog operateLog =
                new OperateLog(null,id,operateTime,className,methodName,methodParams,returnValue,costTime);
        operateLogMapper.insert(operateLog);
        log.info("AOP记录操作日志:{}", operateLog);
        return object;
    }
}
