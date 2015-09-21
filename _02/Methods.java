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
public class Methods {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);
        s = "Hello";
        System.out.println(s);
        String s2 = s;
        System.out.println(s);
        System.out.println(s2);
        String s3 = s2.toLowerCase();
        System.out.println("");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        String s4 = "!!"+s2+"!";
        System.out.println("");
        System.out.print(s4);
        System.out.println("!!".concat(s2).concat("!"));
        char c = s4.charAt(0);
        System.out.println("c:"+c);
        System.out.println(s4.length());
        for (int i = 0; i < s4.length(); i++) {
            System.out.print(s4.charAt(i)+",");
        }
    }
    
}
