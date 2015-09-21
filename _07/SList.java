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
public class SList implements List{
    private SListNode head;
    private SListNode tail;
    
    private int size;
    public SList(){
        head = null;
        size = 0;
    }
    private void insertFront(Object item){
        head = new SListNode(item, head);
        size++;
    }
    private void deleteFront(){
        
    }
    private void printItems(){
        SListNode a = head;
        while(a != null){
            System.out.println(" "+a.item);
            a = a.next;
        }
    }
    
    @Override
    public void addItem(int item) {
        SListNode temp = new SListNode(item, null);
        if(size == 0){
            tail = temp;
        }else{
            tail.next = temp;
            
        }
        tail = temp;
        size++;
    }

    @Override
    public void addItem(int item, int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeItem(int item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeItemAtPosition(int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAllItems(int item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "";
    }
}