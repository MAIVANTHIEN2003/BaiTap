package com.company;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] agrs)
    {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên bất kỳ:");
        n = sc.nextInt();
        for (int i = 1; i < n; i++)
        {
            if (n%i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == n)
        {
            System.out.println("Là số hoàn hảo:");
        }
        else
        {
            System.out.println("Không phải số hoàn hảo:");
        }
    }
    int divisor(int  x )
    {
        return x;
    }

}
