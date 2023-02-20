import java.util.*;
// it will create a chart of star whic is given in your array numbers
public class Bar_chart 
{
   static void  Barchart(int arr[],int len)
   {
    int max=arr[0];
     for(int i=0 ; i<len  ; i++)
     {
        if(max<arr[i])
        {
            max=arr[i];
        }
     }
     for(int i=max; i>=1 ; i--)
     {
        for(int j=0 ; j<len  ; j++)
        {
            if(i<=arr[j])
            {
                System.out.print("*\t");
            }
            else
            {
              System.out.print("\t");
            }
        }
        System.out.println();
     }
   }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("===============================================");
        int len=arr.length;
        Barchart(arr,len);
      //  System.out.println("===============================================");
    }
}
