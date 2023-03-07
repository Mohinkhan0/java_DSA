import java.util.Scanner;

public class Pattern1
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;  // r= row ,c=column
        System.out.println("enetr row");
        r=sc.nextInt();
        System.out.println("enter column");
        c=sc.nextInt();
        for(i=0  ; i<r  ; i++)
        {
            for(j=0  ; j<c  ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
