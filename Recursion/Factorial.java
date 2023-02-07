import java.util.*;
class Factorial
{
    static int factorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
         else
         {

       return num*factorial(num-1);
         }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int num= sc.nextInt();
      int res=factorial(num);
      System.out.println(res);
    }
}