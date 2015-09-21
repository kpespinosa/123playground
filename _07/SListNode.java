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
public class SListNode {
   public Object item; 
   public SListNode next;
   
   SListNode(Object item, SListNode next){
       this.item = item;
       this.next = next;
   }
}
