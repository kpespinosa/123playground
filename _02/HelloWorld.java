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
public class HelloWorld {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
    }
}

class Dog{
    void speak(){
        System.out.println("Woof");
    }
}