import java.util.*;
public class SimpleIntrest 
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter principal ");
      float p=sc.nextFloat();

      System.out.println("Enter your rate ");
      float r=sc.nextFloat();

      System.out.println("Enter your time ");
      float t=sc.nextFloat();

      float SI=p*r*t/100;

      System.out.println(SI);
    }
}
