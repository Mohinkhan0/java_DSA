import java.util.Scanner;

public class multiple {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter any number");
        // int num=sc.nextInt();
         int num=1;
        while(true)
        {
            if( (num%5==0) && (num%7==0) )
            {
                System.out.println("number is " + num);
                break;
            }
            num++;
        }
    }
    
}
