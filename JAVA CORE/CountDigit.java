import java.util.Scanner;

public class CountDigit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        int count=0;
        int n=num;
         while(n>0)
         {
           n= n/10;
           count++;
         }
        System.out.println(count);
    }

}
