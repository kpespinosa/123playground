package com.lec._01;

import com.lec._01.MinMax;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DCS
 */
public class FindMinMax
{

 public static void main(String[] args)
 {
  int[] arr = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11,0};
  FindMinMax f = new FindMinMax();
  MinMax a = f.findMinMaxA(arr);
  MinMax b = f.findMinMaxB(arr);
  System.out.println("maximumA= " + a.max);
  System.out.println("minimumA= " + a.min);
  System.out.println("maximumB= " + b.max);
  System.out.println("minimumB= " + b.min);
 }

MinMax findMinMaxA(int[] a){
    MinMax m = new MinMax();
    m.max = a[0];
    m.min = a[0];
    for(int i=1;i<a.length;i++){
        if(a[i] > m.max)
            m.max = a[i];
    }
    for(int i=1;i<a.length;i++){
        if(a[i] < m.min)
            m.min = a[i];
    }
    return m;
}
 
MinMax findMinMaxB(int[] a){
    MinMax m = new MinMax();
    m.max = a[0];
    m.min = a[0];
    int num1=0,num2=0, i=0;
    for(; i < a.length/2; i++){
        num1 = a[i*2];
        num2 = a[i*2+1];
        if(num1 >= num2){
            if(num1 > m.max){
                m.max = num1;
            }
            if(num2 < m.min){
                m.min = num2;
            }
        }else{
            if(num2 > m.max){
                m.max = num2;
            }
            if(num1 < m.min){
                m.min = num1;
            }
        }
    }
    if(i*2 < a.length){
        int num = a[i*2];
        if(num > m.max)
            m.max = num;
        if(num < m.min)
            m.min = num;
    }
    return m;
}


}




