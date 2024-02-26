package Method;

import java.util.Scanner;

public class SumWithMethod 
{
    int sum(int a , int b) // paramiters(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        SumWithMethod obj=new SumWithMethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
          int res=obj.sum(a,b);  // Arguments (a,b)
          System.out.println("Your sum = " + res);
        
    }
}
