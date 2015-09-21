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
public class Hello {
    public static void main(String[] args) {
        Superman kurt = new Superman();
        kurt.intro("Kurt");
        char[] a = new char[2];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        a[2] = 3;
    }
}


class Superman{
    
    void intro(String name){
        System.out.println("Hello, my name is "+ name);
    }
}