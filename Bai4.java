package com.company;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a:");
        int a;
        a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b:");
        int b;
        b = sc.nextInt();
        System.out.println("UCLN của:" + a + " và " + b + " là :" + UCLN(a,b));

        System.out.println("BCNN của:" + a + " và " + b + " là :" + BCLN(a,b));
    }
    public  static  int UCLN(int a, int b)
    {
        if (b == 0) return a;
        return UCLN (b, a % b);
    }
    public  static  int BCLN(int a, int b)
    {
        return ( a * b) / UCLN(a, b);
    }
}
