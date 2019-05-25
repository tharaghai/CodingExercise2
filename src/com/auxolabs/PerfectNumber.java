package com.auxolabs;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber(int number)
    {
        if(number>1)
        {
            int sum = 0;
            for (int i = 1; i < number; i++)
            {
                if (number % i == 0)
                {
                    sum = sum+i;
                }
            }
            System.out.println(sum);
            if(sum == number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
