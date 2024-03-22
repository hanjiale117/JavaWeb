package com.it117.spring_boot_tlias;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

public class JWTtest {
    @Test
    public void genjwt() {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("username", "tom");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "i2322") //签名算法
                .setClaims(claims) //自定义内容  载荷部分
                .setExpiration(new Date(System.currentTimeMillis() + 12 * 3600 * 1000)) // 令牌有效期 超出这个日期就无效了 12 小时的有效期
                .compact(); // 调用compact 得到一个字符串类型的返回值 这个就是我们需要的JWT令牌
        System.out.println(jwt);
        //eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNzEwNzg1Mjc0LCJ1c2VybmFtZSI6InRvbSJ9.hi4VyEdC_5TKyPbkihhTLvzMJFnHLwWUsajgFVY6zdk
        //第一部分和第二部分能够被解析 但是第三部分是被数字签名加密的 无法解析

        Claims i2322 = Jwts.parser().setSigningKey("i2322")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZX" +
                        "hwIjoxNzEwNzg1Mjc0LCJ1c2VybmFtZSI6InRvbSJ9.hi4VyEdC_5TKyPbkihhTLvzMJFnHLwWUsajgFVY6zdk")
                .getBody();//得到自定义内容
        System.out.println(i2322);
    }
}
