public class PlusOne_LC66 
{
  public static void main(String[] args) 
  {
     int array[]={2,6,8,5,1,3,9};
     plus(array);
  }

    private static void plus(int[] array) 
    {
          for(int i=0; i<array.length ;i++)
          {
            


            if(array[i]==9)
            {
                i--; 
               array[i]=array[i]+1;
               array[i+1]=0;
               break;
            }
            else if(i==array.length-1)
            {
                 array[i]=array[i]+1;
            }
          }
           
          
          for(int i=0; i<array.length ;i++)
          {
            System.out.print(array[i] + " ");
          }
    }  
}
