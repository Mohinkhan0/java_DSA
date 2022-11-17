
public class PowerofNumber_p4
{
    static int power(int n, int p)
    {
        if(p==1)
        {
           return n;
        }
     int res=power(n,p-1);
      return  res*n;

    } 
   public static void main(String[] args) 
   {
    int p;
    p= power(3,3);
    System.out.println(p);
   }   
}
