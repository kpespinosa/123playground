package com.lec._05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DCS
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        a[2] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+",");
        }
        String[] b = new String[4];
        b[0] = "Hi";
        b[1] = "Hello";
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        a[3] = 2;
    }
}
