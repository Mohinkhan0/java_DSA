public class BinarySearch 
{
    static void search(int array[],int srch)
    {
       int start=0;
       int end=array.length-1;
       int mid=0;
       while(start<end)
       {                                  // time complexity is (log n)  
         mid=(start+end)/2;
         if(srch==array[mid])
         {
            System.out.println(" Element is found ...."+array[mid]);
            return;
         }
         else if(srch>array[mid])
         {
            start=mid+1;
         }
         else if(srch<array[mid])
         {
           end=mid-1;
         }
       }
    }
   public static void main(String[] args) 
   {
    int array[]={10,20,30,40,50,60,70,80,90};
   int srch=70;
    search(array,srch);
   }
}
