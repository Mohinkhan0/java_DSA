

public class Factorial_recursion 
{
    static int factorial(int num)
    {
        if(num==0)
            return 1;
        else
           return num*factorial(num-1);
    }
    public static void main(String[] args) 
    {
    int fact=1;
    int num=5;
    fact= factorial(num);
    System.out.println(" "+num+" "+fact); 
    }
        
}