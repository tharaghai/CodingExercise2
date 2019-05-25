package com.auxolabs;

public class LastDigitChecker
{
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(41,27,20));
        System.out.println(isValid(100));
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3)
    {
        boolean check = false;
        if((num1>=10 && num1<=1000) && (num2>=10 && num2<=1000) && (num3>=10 && num3<=1000))
        {
         int a = num1%10;
         int b = num2%10;
         int c = num3%10;
         if(a==b||a==c||b==c)
         {
             return true;
         }
        }
        return check;
    }
    public static boolean isValid(int num4)
    {
        if(num4>=10 && num4 <= 1000)
        {
            return true;
        }
        return false;
    }
}
