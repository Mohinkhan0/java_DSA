public class Snackpattern 
{
    public static void main(String[] args) 
    {
        int array[][]={{1,2,5,6},
                       {4,7,3,2},
                      {12,15,10}};
                      snack(array);
    }

    private static void snack(int[][] array) 
    {
        for(int i=0; i<array.length; i++)
        {
             if(i%2==0)
             {
                for(int j=0; j<array[i].length; j++)
                {
                 System.out.print(array[i][j] + " ");
                }
             }
             else
             {
                for(int j=array[i].length-1; j>=0 ;j--)
                {
                 System.out.print(array[i][j] + " ");
                }
             }
             System.out.println();
        }
    }

}
