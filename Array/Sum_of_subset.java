public class Sum_of_subset 
{
    public static void main(String[] args) 
    {
        int array[]={2,7,11,15, 2,14,6,3};
        int target=9;
        for(int i=0; i<array.length;i++)
        {
            for(int j=1;j<array.length;j++)
            {
                if(target==(array[i]+array[j]))
                {
                   System.out.println(" value is "+array[i] +" "+array[j]);
                   System.out.println(" index is  "+ i +" "+j);
                }   
            }
        }
    }
}
