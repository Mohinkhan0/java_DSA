public class DigitPrint_recoiursion_p6
{
    private static int rem;
    static int digit(int num)
    {
        if(num==0)
        {
           int  rem=num%10;
           digit(num/10);
        }
        return rem;
    }
    public static void main(String[] args) 
    {
   int  rem=digit(12345);
    } 
}
