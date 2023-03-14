public class consecutive_element_sum 
{
     static void sum(int array[], int k)
     {
        int sum=0,maxsum=0;
        for(int i=0 ; i<k;i++) //time complaxity is 2(n) // sliding widdow approach
        {
            sum=sum+array[i];
        }
        for(int i=k ;i<array.length-1;i++)
          {
            sum+=array[i]-array[i-k];
            if(sum>maxsum)
            {
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
     }
    public static void main(String[] args) 
    {
        int array[]={1,40,30,10,20,5};
        int k=3;
        sum(array,k);
    }
}
