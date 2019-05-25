package com.auxolabs;

public class PaintJob
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));

    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
    {
        if(width>=0 && height>=0 && areaPerBucket>=0 && extraBuckets>0)
        {
            double a = width * height;
            int tb = (int) Math.ceil(a / areaPerBucket);
            int res = tb - extraBuckets;
            return res;
        }
        return -1;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket)
    {
        if(width>=0 && height>=0 && areaPerBucket>=0)
        {
            double b = width*height;
            int tb = (int)Math.ceil(b/areaPerBucket);
            return tb;
        }
        return -1;
    }
    public static int getBucketCount(double area,double areaPerBucket)
    {
        if(area>=0 && areaPerBucket>=0)
        {
            double c = area/areaPerBucket;
            int res =(int)Math.ceil(c);
            return res;
        }
        return -1;
    }
}
