package com.lec._04;


public class Condition {
    public static void main(String[] args) {
        test1();
        test2();
        
    }
    static void test1(){
        int month = 1;
        int days = 0;
        switch(month){
            default: 
                days = 31;
            case 2:
                days = 28;
                break;
        }
        System.out.println(days);
    }
    static void test2(){
        int month = 1;
        int days = 0;
        switch(month){
            case 2:
                days = 28;
                break;
            default: 
                days = 31;
                break;
        }
        System.out.println(days);
    }
}
