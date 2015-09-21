/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lec._06;

/**
 *
 * @author DCS
 */
public class Break {
    public static void main(String[] args) {
        int year = 1;
        boolean regular = true;
        boolean good = false;
        switch(year){
            case 1: 
                if(regular){
                    good = true;
                    break;
                }
                System.out.println("Congrats!");
                break;
            default:
                regular = true;
                good = true;
                break;
        }
        System.out.println("Hello!");
        
        
    }
    
}
