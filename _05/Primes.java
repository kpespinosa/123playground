package com.lec._05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DCS
 */
public class Primes {
    public static void main(String[] args) {
        printPrimes(1000);
        printPrimes2(1000);
    }
    
    public static void printPrimes(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(" "+i);
            }
        }
    }
    public static boolean isPrime(int num){
        int divisor = 2;
        boolean isPrime = true;
        while(divisor < num){
            if(num%divisor == 0)
                isPrime = false;
            divisor++;
        }
        return isPrime;
    }
    public static void printPrimes2(int n){
        boolean[] primes = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }
        
        for (int divisor = 2; divisor * divisor < n; divisor++) {
            if(primes[divisor]){
                for (int i = 2 * divisor; i <= n; i = i + divisor) {
                    primes[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(primes[i])
                System.out.println(i);
        }
    }
    
}
