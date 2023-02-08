import java.util.*;
public class Print_counting 
{
    static void counting_print(int num) // function
    {
        if(num==10)    //   tremination case
        return;
         System.out.println(num);
           counting_print(num+1);    // function calling 
    }
     public static void main(String[] args) 
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("enetr any number you wat to start print number");
      int num=sc.nextInt();
      counting_print(num);
     }
}
