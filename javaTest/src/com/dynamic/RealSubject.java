package com.dynamic;

public class RealSubject implements Subject {

    @Override
    public void request(String s, int i) {
        System.out.println("我是真实角色" + s);
    }

}
