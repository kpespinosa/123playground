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
public class ArrayList implements List{
    int[] a;
    int ctr;
    int size;
    
    ArrayList(){
        a = new int[10];
        ctr = 0;
        size = 0;
    }
    public void addItem(int item){
        if(ctr == a.length){
            resize();
        }
        a[ctr] = item;
        ctr++;
        size++;
    }
    public void addItem(int item, int position){
        if (position > size || position < 1){
            System.out.print("Invalid position ");
            return;
        }
        if(ctr == a.length){
            resize();
        }
        int location = position-1;
        for (int i = ctr; i > location; i--) {
            a[i] = a[i-1];
        }
        a[location] = item;
        size++;
        ctr++;
    }
    public boolean removeItem(int item){
        int i;
        boolean found = false;
        for ( i= 0; i < a.length; i++) {
            if(a[i] == item){
                found = true;
                break;
            }
        }
        if(found){
            for (int j = i; j < ctr; j++) {
                a[j] = a[j+1];
            }
            size--;
            ctr--;
        }
        return found;
    }
    public boolean removeItemAtPosition(int position){
        if (position > size || position < 1){
            System.out.print("Invalid position ");
            return false;
        }
        int location = position-1;
        for (int i = location; i < ctr ; i++) {
            a[i] = a[i+1];
        }
        size--;
        ctr--;
        return true;
    }
    public boolean removeAllItems(int item){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == item){
                removeItemAtPosition(i+1);
            }
        }
        return false;
    }
    public int size(){
        return size;
    }
    
    private void resize(){
        int[] b = new int[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
    }
    public String toString(){
        String s = "";
        for (int i = 1; i <= size; i++) {
            s += a[i-1] + " ";
        }
        return s;
    } 
}
