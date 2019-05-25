package com.auxolabs;

import java.util.Scanner;

public class InputCalculator
{
    public static void main(String[] args)
    {
         inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc1 = new Scanner(System.in);
        int sum = 0,count=0,avg=0;
        System.out.println("enter the no");
        while (sc1.hasNextInt())
        {
           int num = sc1.nextInt();
           sum = sum+num;
           count++;
        }
        if(count==0)
        {
            System.out.println("SUM="+sum+" AVG="+avg);
        }
        else
        {
            avg = Math.round(sum/count);
            System.out.println("SUM="+sum+" AVG="+avg);
        }
    }
}
