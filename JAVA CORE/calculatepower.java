import java.util.Scanner;

public class calculatepower 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A");
        int a=sc.nextInt();
        System.out.println("enter B");
        int b=sc.nextInt();
            int ans=1;
        for(int i=1 ; i<=b ; i++)
        {
           ans=ans*a;
        }
         System.out.println("Power of A into B is " + ans);
    
    }
}
