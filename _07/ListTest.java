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
public class ListTest {
    public static void main(String[] args) {
        SList ar = new SList();
        
        //addItem(item)
        System.out.println("ADDING ITEMS");
            //when array is not full
            for (int i = 0; i < 10; i++) {
                ar.addItem(i+1);
            }
            System.out.println(ar.toString()+" should be:1 2 3 4 5 6 7 8 9 10");
            //when array is full
            ar.addItem(11);
            System.out.println(ar+" should be:1 2 3 4 5 6 7 8 9 10 11");
        
        //addItem(item, position)
        System.out.println("ADDING ITEMS GIVEN POSITION");
            //at a position <= size
            ar.addItem(12, 2);
            System.out.println(ar+" should be:1 12 2 3 4 5 6 7 8 9 10 11 ");
            //at a position < 0
            ar.addItem(12, -1);
            System.out.println(ar+" should be: Invalid position 1 12 2 3 4 5 6 7 8 9 10 11");
            //at a position > size
            ar.addItem(12, 12);
            System.out.println(ar+" should be:1 12 2 3 4 5 6 7 8 9 10 12 11 ");
            
        //removeItem(item)
        System.out.println("REMOVING ITEMS");
            //an item found in the array
            ar.removeItem(12);
            System.out.println(ar+" should be: 1 2 3 4 5 6 7 8 9 10 12 11");
            //an item not in the array
            ar.removeItem(13);
            System.out.println(ar+" should be: 1 2 3 4 5 6 7 8 9 10 12 11 ");
            //an item at the end of the array
            ar.removeItem(11);
            System.out.println(ar+" should be: 1 2 3 4 5 6 7 8 9 10 12");
            //an item at the beginning of the array
            ar.removeItem(1);
            System.out.println(ar+" should be:2 3 4 5 6 7 8 9 10 12");
            
        //removeItem(position)    
        System.out.println("REMOVING ITEMS GIVEN POSITION");
            //valid position:middle
            ar.removeItemAtPosition(3);
            System.out.println(ar+" should be:2 3 5 6 7 8 9 10 12");
            //valid position:leftmost
            ar.removeItemAtPosition(1);
            System.out.println(ar+" should be: 3 5 6 7 8 9 10 12");
            //valid position:rightmost
            ar.removeItemAtPosition(8);
            System.out.println(ar+" should be: 3 5 6 7 8 9 10");
            //invalid positions: < 1
            ar.removeItemAtPosition(0);
            System.out.println(ar+" should be:3 5 6 7 8 9 10");
            //invalid positions: >size
            ar.removeItemAtPosition(8);
            System.out.println(ar+" should be:3 5 6 7 8 9 10");
        
        //removeAllItems(item)
        System.out.println("REMOVING ALL ITEMS");
            //only one item
            ar.removeAllItems(3);
            System.out.println(ar+" should be:5 6 7 8 9 10");
            //many same items
            ar.addItem(8);
            ar.removeAllItems(8);
            System.out.println(ar+" should be:5 6 7 9 10");
    }
}
