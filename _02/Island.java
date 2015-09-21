/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lec._02;

/**
 * Draw the final objects
 *
 * @author DCS
 */
public class Island {

    Island i;

    public static void main(String[] args) {
        Island i1 = new Island();
        Island i2 = new Island();
        Island i3 = new Island();
        i1.i = i2;
        i2.i = i3;
        i3.i = i1;
        i1 = null;
        i2 = null;
        i3 = null;
    }
}
