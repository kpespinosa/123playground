/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lec._07;

/**
 *
 * @author DCS
 */
public class ArrayListC {
    int[] a;
    int lastItem;
    
    ArrayListC(){
        a = new int[10];
        lastItem = 0;
    }
    
    public void insertItem(int item){
        if(lastItem == a.length){
            int[] b = new int[a.length*2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        
        a[lastItem] = item;
        lastItem++;
    }
    public void removeItem(int item){
        //search for the item
        int i;
        for ( i= 0; i < a.length; i++) {
            if(a[i] == item)
                break;
        }
        int j;
        for ( j= i; j <= a.length-1; j++) {
            a[j] = a[j+1];
        }
        
        a[j] = -1;//j+1
        
        //shift elements 1 space to the left
    }
    
    public static void main(String[] args) {
        ArrayListC ar = new ArrayListC();
        
        for (int i = 0; i <ar.a.length ; i++) {
            ar.insertItem(i);
        }
        
        ar.insertItem(5);
        for (int i = 0; i < ar.a.length; i++) {
            System.out.print(" "+ar.a[i]);
        }
        
        ar.removeItem(4);
        for (int i = 0; i < ar.a.length; i++) {
            System.out.print(" "+ar.a[i]);
        }
    }
}
