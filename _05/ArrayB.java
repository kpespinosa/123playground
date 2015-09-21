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
public class ArrayB {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 2;
        a[2] = 0;
        if(a[3] == 0)
            System.out.println("hello");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        //a[3] = 3;//ArrayIndexOutOfBoundsException

    }
}
