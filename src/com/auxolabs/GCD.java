package com.auxolabs;

public class GCD
{
  public static void main(String[] args)
  {
      System.out.println(getGreatestCommonDivisor(25,15));
  }
  public static int getGreatestCommonDivisor(int first,int second)
  {
      int check = -1;
      if(first>10 && second>10)
      {
          int max = Math.max(first,second);
          for (int i = 1;i<=max;i++)
          {
              if(first%i==0 && second%i == 0)
              {
                  check = i;
              }
          }
      }
      return check;
  }

}
