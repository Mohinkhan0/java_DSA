import java.util.*;
public class Max_Element 
{
    static void maximum(int arr[],int n)
    {
        int max=arr[0];
      for(int i=0;i<n;i++)
      {
        if(max <arr[i])
        {
         max=arr[i];
        }
      }
      System.out.println(max);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt(); 
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
         arr[i]=sc.nextInt();
        }
       int n=arr.length;
        maximum(arr, n);
    }
}
