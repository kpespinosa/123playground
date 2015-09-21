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
public class DList {
    private DListNode head;
    private int size;
    
    DList(){
        head = new DListNode(null, head, head);
        size = 0;
    }
    public void insertFront(Object item){
        DListNode temp = new DListNode(item, head, head.next);
        head.next = temp;
        if(size == 0)
            head.prev = temp;
        size++;
    }
    public void removeBack(){
        if(head.prev != head){
            head.prev = head.prev.prev;
            head.prev.next = head;
            size--;
        }
    }
    @Override
    public String toString(){
        String s = "";
        DListNode d = head.next;
        while(d != head){
            s = s+ d.item.toString()+" ";
            d = d.next;
        }
        return s;
    }
    public static void main(String[] args) {
        DList d = new DList();
        d.insertFront(1);
        System.out.println(d.toString());
        d.insertFront(2);
        System.out.println(d);
        d.removeBack();
        System.out.println(d);
    }
            
}

class DListNode{
    Object item;
    DListNode prev;
    DListNode next;
    DListNode(Object item, DListNode prev, DListNode next){
        this.item = item;
        this.prev = prev;
        this.next = next;
    }
}
