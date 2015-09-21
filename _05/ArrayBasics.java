/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lec._05;

/**
 *
 * @author DCS
 */
public class ArrayBasics {
    public static void main(String[] args) {
        String[] a = new String[3];
        a[0] = "hi";
        a[2] = "hey";
//        if(a[3].equals("hi"))
//            System.out.println("hi");
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] == null)
                a[i] = "h";
            System.out.println(" "+a[i]);
        }
    }
}
