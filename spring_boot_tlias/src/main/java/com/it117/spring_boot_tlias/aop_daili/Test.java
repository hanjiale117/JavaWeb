package com.it117.spring_boot_tlias.aop_daili;

public class Test {
    public static void main(String[] args) {

        //获取代理的对象
        BigStar newBigStar = new BigStar("dicker");
        Star proxy = ProxyUtil.creatProxy(newBigStar);

        String sing = proxy.sing();
        System.out.println(sing);
        proxy.dance();


    }
}
