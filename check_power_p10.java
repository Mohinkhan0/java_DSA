import java.util.*;
public class check_power_p10
{
   //  it program will check any nmber is power of 2 single number 
   //  
    static boolean check(int n)
    {
        if(n==1)  // base case (terminattion case)
        {
        return true;
        }
        else if(n%2!=0 ||n==0 )
        {
           return false;
        }
        else
        return check(n/2);  //recursive function
       }
    
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter anu number");
    int n=sc.nextInt();
    boolean b   = check(n);
    System.out.println(b);
 }   
}
