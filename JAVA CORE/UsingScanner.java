import java.util.*;
public class UsingScanner 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number = ");
        int  num=sc.nextInt();
        System.out.println(num);

        System.out.print("enter any single String(Name) =");
        String str=sc.next();
        System.out.println(str);
        System.out.print("enter any Sentence String(Name) =");
        sc.nextLine(); // its create new address in main  memory 
        String st=sc.nextLine();
        System.out.println(st);
    }
}
