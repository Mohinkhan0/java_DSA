import java.util.Scanner;

public class Adjasent_star_p9 
{
    static String op= "";
    static void str1(String str,int i)
    {
        op=op+str.charAt(i);
    if(i==str.length()-1)
    {
        return;
    }
    if(str.charAt(i)== str.charAt(i+1)) // cpmpairing of two variables
    {
         op=op+"*";
    }
     str1(str,i+1); // call str1 function
   }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any String"); // ex->  aabbabaabb it will adjest the star of repeted variable;
        String str=sc.next();
        str1(str,0);
        System.out.print(op);
    }
    
}
