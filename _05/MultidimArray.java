package com.lec._05;

public class MultidimArray {
    public static void main(String[] args) {
        //rectangular arrays
        int[][] a = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
        
        //arrays of objects
        Human kurt = new Human("Kurt");
        
        Human[] b = {kurt, new Human("John")};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        
        //non-rectangular arrays
        int x = 1, y=6, z=8;
        int[][] c = {{1,2,3},{x},{4,5},{y+z, 2}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(" "+c[i][j]);
            }
            System.out.println("");
        }
        //subtleties
        int[] k,l,m;            //k,l,m are 1D arrays
        int o[], p, q[][];      //o is 1d array, p not an array, q 2d array
        int[] e, f[];           //e 1d array, f 2d array
        
        //array of objects
        String[] d = new String[3];
        d[0] = "hi";
        d[2] = "hello";
        for (int i = 0; i < d.length; i++) {
            System.out.println(" "+d[i]);
        }
    }
}
class Human{
    String name;
    Human(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}