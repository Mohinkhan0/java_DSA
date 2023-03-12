public class GasStation 
{
    
     static void station(int[] gas, int[] cost) 
    {
        int i,loss=0,start=0,rem=0;
      for(i=0 ; i<gas.length-1 ;i++);
      {
        rem=gas[i]-cost[i];
        if(rem<0)
         {
         start=i+1;
         loss+=rem;
         rem=0;
         }
      }
      System.out.println("rem=" +rem);
      System.out.println("loss=" +loss);
      if(loss+rem>=0)
      {
        System.out.println(start);
      }
    }
    public static void main(String[] args) 
    {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        station(gas,cost);
    }
}
