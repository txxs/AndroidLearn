package com.realize.txxs.andriodlearn;

import java.io.Serializable;

/**
 * Created by txxs on 2017/6/27.
 */

public class Person implements Serializable{

    private int age;
    private String name;
    private String address;

    public Person() {
    }

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
