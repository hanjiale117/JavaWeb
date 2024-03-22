package com.it117.spring_boot_tlias.aop_daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star creatProxy(BigStar bigStar) {
        //Proxy.newProxyInstance返回类型为Object 需要进行强转
        Star star = (Star) Proxy.newProxyInstance(
                //这个类加载器一般都是当前这个类的类加载器
                ProxyUtil.class.getClassLoader(),//参数一.用于指定用哪个类加载器,去加载生成的代理类
                new Class[]{Star.class},//指定接口,这些接口用于指定生成的代理长什么样子 也就是有哪些方法
                /**这里写的接口只能是BigStar实现的接口
                 能代理的方法都在接口里面
                 才能添加里面 否则不能添加
                 */
                new InvocationHandler() {//用来指定生成的代理对象要干什么事情
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /** invoke方法就是代理要干的事情
                         proxy就是代理的对象 一般不使用
                         method表示要运行的方法 例如:sing()或者dance()
                         args 调用这些要运行方法所要传递的实参
                         */

                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒,收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地,收钱");
                        }
                        //寻找对象
                        //调用对象的方法 使用反射的方法invoke
                        return method.invoke(bigStar, args);
                    }
                }
        );
        return star;
    }
}
