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
public class AList {
    int[] a;
    int lastItem;
    
    public AList(){
        a = new int[10];
        lastItem = -1;
    }
    
    public void insertItem(int newItem, int location){
        if(lastItem+1 == a.length){
            int[] b = new int[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        for (int i = lastItem; i >= location ; i--) {
            a[i+1] = a[i];
        }
        a[location] = newItem;
        lastItem++;
        
    }
    
    public void deleteItem(int location){
        
    }
    public boolean findItem(int item){
        return false;
    }
    public int nthItem(int location){
        return 0;
    }
    
    public String toString(){
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i]+" ";
        }
        return s;
    }
    public static void main(String[] args) {
        AList a = new AList();
        //a.insertItem(2, 0);
        System.out.println(a);
        //a.insertItem(5, 0);
        System.out.println(a);
        for (int i = 0; i < a.a.length; i++) {
            a.insertItem(i, 0);
        }
        System.out.println(a);
        a.insertItem(5, 0);
        System.out.println(a);
        a.insertItem(-1, 19);
        System.out.println(a);
        //a.insertItem(-2, 20);
        //System.out.println(a);
    }
}
