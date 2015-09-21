package com.lec._02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DCS
 */
public class Simple {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Kitty";
        System.out.println(c.name);
        c.sayHello();
        System.out.println(c.name);
    }
}

class Cat{
    String name;
    void sayHello(){
        String name = "me";
        this.name = name;
    }
}
