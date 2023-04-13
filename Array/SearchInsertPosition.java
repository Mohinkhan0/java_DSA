public class SearchInsertPosition 
{
    public static void main(String[] args) 
    {
        int array[]={10,20,30,40,50};
        int value=35;
      int  res= search(array,value);
      System.out.println(" it will insert index   "+res);
    }
     static int search(int array[],int value)
    {
        int i;
        
        for( i=0;i<array.length;i++)
        {
            if(array[i]>value)
            {
                return i;
            }
        }
          return i;
    }
}