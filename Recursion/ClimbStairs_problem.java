import java.util.*;
public class ClimbStairs_problem
 {

    static int climbStairs(int n) // function defination
    {
       if(n<=1)
       {
           return 1;
       }
        return climbStairs(n-1)+climbStairs(n-2); // function call and return 
    }
      public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int res=climbStairs(n);
        System.out.println(res);
        /*
            its priblem depend on the branching tree problem 
            its problem of leet code
            we are giving inpot is 3 so it will provide how many types can acces 3
            1 1 1
            1 2
            2,1
         */
    }
}

