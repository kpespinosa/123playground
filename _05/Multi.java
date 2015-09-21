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
public class Multi {
    public static void main(String[] args) {
        String[][] a = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
    }
    
}
