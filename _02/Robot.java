package com.lec._02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DCS
 */
class Robot {
    boolean canSee;
    String name;
    
    Robot(){
        canSee = false;
        name = "Unnamed";
    }
    Robot(String iname, boolean icanSee){
        canSee = icanSee;
        name = iname;
    }
    void sayHello(){
        System.out.println("Hey! I am your "
                + "personal healthcare companion, "+name);
        if(canSee)
            System.out.println("I can see you.");
    }
}

class TestRobot{
    public static void main(String[] args) {
        Robot baymax = new Robot();
        baymax.canSee = true;
        baymax.name = "Baymax";
        baymax.sayHello();
        Robot bat = new Robot();
        bat.sayHello();
        Robot r = new Robot("John", true);
        r.sayHello();
    }
}

