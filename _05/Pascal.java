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
public class Pascal {
    public static int[][] pascalTriangle(int n){
        int[][] a = new int[n][];
        
        for (int i = 0; i < n; i++) {
           a[i] = new int[i+1];
           a[i][0] = 1;
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i-1][j-1]+a[i-1][j];
            }
           a[i][i] = 1;
        }
        return a;
    }
    public static void main(String[] args) {
        int[][] a = pascalTriangle(10);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
    }
}
