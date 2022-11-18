public class SumofDigits_p5
 {
    static int sumdigit(int n)
    {
        int rev=0;
        if(n!=0)
        {
        return ((n%10)+sumdigit(n/10));
        }
        return rev;
    
    }
    public static void main(String[] args) 
    {
      int y= sumdigit(1234);
      System.out.println(y);
    }
}
