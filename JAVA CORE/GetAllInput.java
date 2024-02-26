import java.util.*;
public class GetAllInput 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter integer = ");
        int num=sc.nextInt();
        System.out.print("enter string = ");
        String str=sc.next();
        System.out.print("enter float = ");
        float f=sc.nextFloat();
        System.out.print("enter boolean = ");
        boolean b=sc.nextBoolean();
        System.out.print("enter string with space = ");
        sc.nextLine();
        String str1=sc.nextLine();
    
       System.out.println(num);
       System.out.println(str);
       System.out.println(f);
       System.out.println(b);
       System.out.println(str1);

    }
}
