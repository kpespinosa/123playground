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
public class LinkedListC {
    public static void main(String[] args) {
        Node a = new Node(), 
            b = new Node(),
            c = new Node();
        a.next = b;
        b.next = c;
        c.next = null;
        a.item = 1;
        b.item = 2;
        c.item = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        a.insertAfter(4);
        c.insertAfter(7);
        System.out.println(a);
        
        Node l = a.insertFront(6);
        System.out.println(l);
        
        Node m = b.insertFront(8);
        System.out.println(l);
        System.out.println(m);
    }
    
}


class Node{
    int item;
    Node next;
    Node(){
        this(0,null);
    }
    Node(int item, Node next){
        this.item = item;
        this.next = next;
    }
    void insertAfter(int item){
        Node temp = new Node(item, this.next);
        this.next = temp;
    }
    
    Node insertFront(int item){
        return new Node(item, this);
    }
    
    
    public String toString(){
        String s = "";
        Node temp = this;
        while(temp != null){
            s = s+temp.item+" ";
            temp = temp.next;
        }
        return s;
//        if(this==null)
//            return;
//        else{
//            return this.item+" "+this.next.toString();
//        }
            
    }
}