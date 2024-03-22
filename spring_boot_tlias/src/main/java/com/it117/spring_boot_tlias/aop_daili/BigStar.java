package com.it117.spring_boot_tlias.aop_daili;

public class BigStar implements Star {
    private String name;

    public BigStar(String name) {
        this.name = name;
    }
    @Override
    public String sing() {
        System.out.println(this.name + "sing....");
        return "thanks";
    }

    @Override
    public void dance() {
        System.out.println("dance....");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

