public class pramid1 
{
     public static void main(String[] args) 
     {
        int i,j,row=5 ,k=1;
        for(i=0; i<row;i++)
        {
          for(j=0 ;j<i; j++)
          {
             System.out.print(k+" ");
             k++;
          }
          System.out.println();
        }
     }
}
