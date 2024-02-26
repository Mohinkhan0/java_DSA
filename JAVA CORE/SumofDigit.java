import java.util.Scanner;

public class SumofDigit 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
