public class Factorial_p3 
{
    static int  factorial(int n)
     {
       if(n==0)
       {
        return 1;
       }
       else
       {
             return (n*factorial(n-1));
       }
     }
    public static void main(String[] args) 
    {int fact=1;
      fact=factorial(5);
      System.out.println("your factorial is " + fact);

    }
}
