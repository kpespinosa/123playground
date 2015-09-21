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
public class LinkedListA {
    public static void main(String[] args) {
        ListNodeA l1 = new ListNodeA(),
               l2 = new ListNodeA(),
                l3 = new ListNodeA();
   
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        l1.item = 3;
        l2.item = 4;
        l3.item = 5;
        
        System.out.println(l1);
        System.out.println(l3);
        System.out.println(l2);
        
        l2.insertAfter(6);
        System.out.println(l1);
        l3.insertAfter(7);
        System.out.println(l1);
        l1.insertAfter(1);
        System.out.println(l1);
        ListNodeA l0 = l1.insertBefore(6);
        System.out.println(l0);
    }
}

class ListNodeA{
    int item;
    ListNodeA next;
    ListNodeA(){
        this.item = 0;
        this.next = null;
    }
    ListNodeA(int item, ListNodeA l){
        this.item = item;
        this.next = l;
    }
    ListNodeA(int item){
        this(item, null);
    }
    
    void insertAfter(int item){
        //ListNodeA l = new ListNodeA(item, this.next);
        //this.next = l;
        this.next = new ListNodeA(item, this.next);
        //next = new ListNodeA(item, next);
    }
    
    ListNodeA insertBefore(int item){
        return new ListNodeA(item, this);
    }
    
    public String toString(){
        String s = "";
        ListNodeA ptr = this;
        while(ptr!=null){
            s = s+ptr.item+" ";
            ptr = ptr.next;
        }
        return s;
    }
    
}