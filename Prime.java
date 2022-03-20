package com.company;

import java.util.Scanner;

public class Prime {
    public static void  main (String [] args){
        //nhap 1 so tu ban phim, kiem tra co phai so nguyen to hay khong?
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so n= ");
        n = sc.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("So "+n+ " la so nguyen to");
        }
        else {
            System.out.println(" "+n+ " khong phai la so nguyen to");
        }
        int[] arr = new int[10];
        arr[0] = 13;
        arr[1] = 15;
        for (int i=0;i<10;i++){
            arr[i]=i*2+1;
        }
        for (int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        //for-each
        for (int r : arr){
            System.out.println(r);
        }
    }
    public static boolean checkPrime(int n){
        if (n<2) return false;
        if (n<4) return true;
        for (int i =2;i<=n/2;i++){
            if (n%i==0)return false;
        }return true;
    }
}