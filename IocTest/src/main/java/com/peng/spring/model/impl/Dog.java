package com.peng.spring.model.impl;

import com.peng.spring.model.Animal;

/**
 * Created by Jack on 2015/12/29.
 */
public class Dog implements Animal {
    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public void leg() {
        System.out.println(msg + "，四条腿");
    }

    public void wing() {
        System.out.println(msg + "，没翅膀");
    }
}
