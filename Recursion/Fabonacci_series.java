import java.util.*;
public class Fabonacci_series
 {
    static void Fabonacci(int a,int b,int num)
    {
        if(num==0)
        {
            return;
        }
        int c=a+b;
        System .out.println(c);
        Fabonacci(b,c,num-1);
    }
    public static void main(String[] args) 
    {
        int a=0,b=1;;

        Scanner sc=new Scanner(System.in);
        System .out.println("enter no of length");
        int num=sc.nextInt();
        System .out.println(a);
        System .out.println(b);
        Fabonacci(a,b,num-2);
     //  System .out.println();
    }
}
