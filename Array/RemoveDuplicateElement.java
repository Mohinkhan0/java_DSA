public class RemoveDuplicateElement 
{
    static void RemoveElement(int array[])
    {
        int i,j;   // time complexity is O(n)Square
        for(i=0 ; i<array.length;i++)
        {
            for(j=i+1; j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    array[i]=-1;
                }
            }
        }
        System.out.println(" After removing");
        for(j=0;j<array.length;j++)
        {
            if(array[j]!=-1)
            {
                System.out.print(" " + array[j]);
            }
        }
    }
     public static void main(String[] args) 
     {
         int array[]={2,5,3,6,5,2,1,9,3,8,7};
         RemoveElement(array);
     }
}
