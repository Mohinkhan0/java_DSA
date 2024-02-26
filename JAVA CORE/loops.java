import java.util.Scanner;

public class loops
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter any number");
         int num=sc.nextInt();
         //=======================================
        //  int i=1 ,sum=0;;
        // while(i<=num)
        // {
        //     System.out.println(i);
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.println("our running sum is ");
        // System.out.println(sum);
        //========================================

        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(num + " X " + i + " = " + num*i);
        }

    }
}