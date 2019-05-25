package com.auxolabs;

public class EvenDigitSum
{
    public static void main(String[] args)
    {
      getEvenDigitSum(6789);
    }
    public static void getEvenDigitSum(int number)
    {
        int sum = 0;
        if (number < 0)
        {
            System.out.println(-1);
        }
        else
        {
            while (number > 0)
            {
                int a = number % 10;
                if (a % 2 == 0)
                {
                    sum+= a;
                }
                number = number / 10;

            }
            System.out.println(sum);
        }
    }
}
