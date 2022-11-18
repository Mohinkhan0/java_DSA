public class DigitPrint_recoiursion_p6
{
    private static int rem;
    static int digit(int num)
    {
              if(num!=0)
        {
          rem=num%10;
          System.out.println(rem);
          digit(num/10);
        }
        return rem;

    }
    public static void main(String[] args) 
    {
        int r=digit(12345);
    } 
}
 /*
output
5
4
3
2
1
  */