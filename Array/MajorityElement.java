public class MajorityElement
{
    private static int maxmajority(int[] array, int len)
    {
        int count=0,majority=0;
        for(int i=0; i<len;i++)
        {
          //time complexity o(n)
            if(count==0)
            {
                majority=array[i];
            }
            if(majority==array[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return majority;
    } 
 public static void main(String[] args) 
 {
    int array[]={1,2,2,1,2,1,2,2};
    int len=array.length;
    int res= maxmajority(array,len);
    System.out.println(res);
 }

  
}
