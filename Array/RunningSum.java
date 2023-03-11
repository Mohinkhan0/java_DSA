public class RunningSum 
{
      
    static void Running(int[] array) 
    {
        int length=array.length;
         System.out.print(array[0]);
            for(int i=1 ; i<length ; i++)
            {
                array[i]=array[i-1]+array[i];
                System.out.print(" " + array[i]);
            }

    }
     public static void main(String[] args) 
     {
        int array[]={1,2,3,4,5};
        Running(array);
     }
    
}
