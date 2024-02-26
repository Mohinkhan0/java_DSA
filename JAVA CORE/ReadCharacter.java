import java.util.*;
public class ReadCharacter 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String");
        char str=sc.next().charAt(2);  // find out the character in a String
        System.out.println(str);


    }
}
