import java.util.Scanner;

public class Pallindrom
 {
     public static void main(String[] args) 
     {
        int rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
       int temp=num;
        while(num!=0)
        {
          rem=num%10;
          rev=(rev*10) +(rem);
          num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("pallindrome");
        }
        else
        {
          System.out.println("not palindrom");
        }
     }
}
