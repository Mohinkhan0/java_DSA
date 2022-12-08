import java.util.ArrayList;
import java.util.Scanner;

public class Well_parantheses 
{

     static ArrayList<String> generate(int n)
     {
        ArrayList<String> result=new ArrayList<>();
        helper(result , "" , 0 , 0 , n);
        return result;

     }
    static void helper(ArrayList<String> result, String currbracket,int open,int close ,int max)
    {
       if(currbracket.length()== max*2)
       {
         result.add(currbracket);
         return;
       }
       if(open < max)
       {
        helper(result, currbracket+"(" , open+1, close, max);
       }
       if(open>close)
       {
        helper(result,currbracket+")",open,close+1,max);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter eny number");
        int n=sc.nextInt();
        ArrayList<String> res= generate(n);
        System.out.println(res);
        // output-> [((())), (()()), (())(), ()(()), ()()()] 
        //it will perform opening bracket and close brcket is same;
    }
}
