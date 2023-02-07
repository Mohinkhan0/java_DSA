import java.util.*;
public class sum_recursion 
{
    static int sum(int num1,int num2)
    {
        return(num1+num2);
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter first number");
       int num1=sc.nextInt();
       System.out.println("enter second number");
       int num2=sc.nextInt();
       int res=sum(num1,num2);
       System.out.println(res);
    }
}
