//import java.util.Arrays;

public class Second_mex 
{
   /*  private static void secondm(int[] array,int length) 
    {
        // first approach of used sort method of array
        int i,temp;
        Arrays.sort(array);
        System.out.println(array[length-2]);
        for(i=0   ;  i<length  ;  i++)
        {
           System.out.println(" ");
        }

    }
    */
    private static void secondm(int[] array,int length) 
    {
        // time complexity is O(n)
         int higest=Integer.MIN_VALUE;
         int secondhighest=Integer.MIN_VALUE;
         for(int i=0; i<length; i++)
         {
            if(array[i]>higest)
            {
                secondhighest=higest;
                higest=array[i];
            }
            if(array[i]<higest && array[i]>secondhighest)
            {
                secondhighest=array[i];
            }
         }
         System.out.println("Second highest is "+secondhighest); 
    }
    public static void main(String[] args) 
    {
        int array[]={2,7,11,15, 2,14,6,3 };
        int length=array.length;
        secondm(array,length);
       
    }

    
}
