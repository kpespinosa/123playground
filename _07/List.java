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
public interface List {
    /**
     * Adds an item at the beginning of the list. This increases the size by 1.
     * @param item 
     */
    public void addItem(int item);
    /**
     * Adds an item at a specific position in the list. The position indexed starting 1.
     * @param item an integer value
     * @param position an integer starting at 1 indicating position in the list
     */
    public void addItem(int item, int position);
    /**
     * Removes the first occurrence of item in the list
     * @param item an integer value
     * @return returns true if item is successfully removed, false otherwise
     */
    public boolean removeItem(int item);
    /**
     * Removes the item at the indicated position
     * @param position an integer valued index starting at 1
     * @return returns true if item is successfully removed, false otherwise
     */
    public boolean removeItemAtPosition(int position);
    /**
     * Removes all occurrences of item in the list
     * @param item an integer valued element
     * @return returns true if all items have been removed, false otherwise.
     */
    public boolean removeAllItems(int item);
    /**
     * Returns the number of items in the list
     * @return the number of items in the list
     */
    public int size();
    /**
     * Returns a string representation of the list
     * @return returns a string implementation of the list
     */
    public String toString();
}
