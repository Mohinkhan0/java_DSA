import java.util.Scanner;
    
public class ifelse{
    
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
    //   int num1=10 , num2=20;

    //   if(num1>num2)
    //   {
    //     System.out.println(" Greater " + num1);
    //   }
    //   else{
    //     System.out.println("Greater " + num2);
    //   }
  // ====================================================
    // System.out.println("enter your age");
    // int age=sc.nextInt();

    // if(age<12)
    // {
    //     System.out.println("You are a child " + age);
    // }
    // else if(age>12 && age<18)
    // {
    //      System.out.println(" you are a teenager " + age);
    // }
    // else
    // {
    //     System.out.println(" your are a adelt " + age );
    // }

    //===========================================================
     System.out.println("enter your number");
     int num=sc.nextInt();
     switch(num)
     {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
          default:
          System.out.println("pls enter valid chice !!!!");
     }
     

    }
}
