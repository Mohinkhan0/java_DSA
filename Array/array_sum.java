import java.util.Scanner;

public class array_sum 
{
      // this program calculate sum of two arrays
    public static void main(String[] args) 
    {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first array size");
        int size=sc.nextInt();
        int[] array1=new int[size];
        System.out.println("enter data");
        for(i=0; i<array1.length;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("enter second array size");
        int size2=sc.nextInt();
        int[] array2=new int[size2];
        System.out.println("enter data");
        for(i=0; i<array2.length ; i++)
        {
            array2[i]=sc.nextInt();
        }


        System.out.println("***********************************************");
        System.out.println("your sum");
        for( i=0; i<array1.length;i++)
        {
            array1[i]=array1[i]+array2[i];
            System.out.print("   "+array1[i]);
        }
    }
}
