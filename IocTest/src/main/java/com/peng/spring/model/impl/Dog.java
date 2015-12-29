package com.peng.spring.model.impl;

import com.peng.spring.model.Animal;

/**
 * Created by Jack on 2015/12/29.
 */
public class Dog implements Animal {
    public void leg() {
        System.out.println("四条腿");
    }

    public void wing() {
        System.out.println("没翅膀");
    }
}
