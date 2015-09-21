/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lec._06;

import java.io.*;
/**
 *
 * @author DCS
 */
public class AdvanceIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        loop1(br);
        loop2(br);
        loop3(br);
    }
    
    public static void loop1(BufferedReader br) throws IOException{
        String s;
        do{
            s = br.readLine();
            System.out.println("loop1:"+s);
        }while(s.length() > 0);
    }
    
    public static void loop2(BufferedReader br) throws IOException{
        String s = br.readLine();
        while(s.length() > 0){
            System.out.println("loop2:"+s);
            s = br.readLine();
        }
    }
    
    public static void loop3(BufferedReader br) throws IOException{
        String s;
        while(true){
            s = br.readLine();
            if(s.length() == 0)
                break;
            System.out.println("loop3:"+s);
        }
    }
}
