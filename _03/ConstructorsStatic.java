package com.lec._03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DCS
 */
public class ConstructorsStatic {
    public static void main(String[] args) {
        Human kurt = new Human();
        kurt.introduce();
        kurt = new Human("Kurt");
        kurt.superman = true;
        kurt.introduce();
        Human john = new Human("John");
        john.follow(kurt);
        john.introduce();
    }
}

class Human{
    int age;
    String name;
    boolean superman;
    static int numHumans;
    Human(){
        this("Adam");
        this.age = 0;
    }
    Human(String name){
        this.name = name;
        this.age = 7;
        numHumans++;
        
    }
    void introduce(){
        String name = "Sensei ";
        if(numHumans%2==0)
            this.name = name + this.name;
        System.out.println("I am " + this.name + " and I am "+ age + " years old.");
        System.out.println("Am I superman yet? "+superman);
        System.out.println("I am human number "+numHumans);
        System.out.println();
    }
    void follow(Human h){
        superman = h.superman;
    }
}