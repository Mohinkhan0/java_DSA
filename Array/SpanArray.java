public class SpanArray 
{

    static void span(int array[],int length)
    {
       int temp; // it will calcuate span of array like it will do (maximum-minimun) of an array 
       for(int i=0; i<length;i++)
       {
         for(int j=0 ; j<length; j++)
         {
           if(array[j]<array[i])
           {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
           }
         }
       }
       for(int j=0 ; j<length; j++)
       {
        System.out.println(" " + array[j]);
       } 
       System.out.print("your span is ");
       System.out.print(array[0]-array[length-1]);
    }
    public static void main(String[] args) 
    {
        int array[]={2,7,11,15, 8,14,6,3};
        int length=array.length;
        span(array,length);
    }
}
