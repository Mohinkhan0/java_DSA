
public class NearestofElement 
{
    static void findnearest(int array[],int element)
    {
        int low=0;
        int high=array.length;
        int mid=0;
        // time complexity is log(n)
        while(low<high)
        {
          mid=(low+high)/2;
          if(element==array[mid])
          {
            System.out.println(array[mid]-1  +" "+(array[mid]+1));
            return;
          }
          else if(element>array[mid])
          {
            low=mid+1;
          }
          else if(element>array[mid])
          {
            high=mid-1;
          }
        }
    }
    
    public static void main(String[] args) 
    {
         int array[]={12,15,20,25,40,45,50,55,58,70};
        int element=45;
         findnearest(array,element);
    }
}
