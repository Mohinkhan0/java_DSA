
public class Armstrong_recursion_p2
{
    // 153 divide and power of reminder and sum is also 153;
    private static double rem = 0;
    static boolean isArmstromg(int num,int sum,int temp)
    {
     if(num==0)
     {
        if(sum==temp)
        {
            return  true;
        }
        return false;
    }

         rem = num%10;
         sum+=(Math.pow(rem,3));
         num=num/10;
         return isArmstromg(num,sum,temp); 
    }
   public static void main(String[] args)
    {
    boolean r= isArmstromg(153, 0, 153);
    System.out.println(r);
   } 

}

