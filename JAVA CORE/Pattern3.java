import java.util.Scanner;

public class Pattern3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no of star");
        int row=sc.nextInt();
        for(int i=1 ; i<=row; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*
*
**
***
****
*****
     */
}
