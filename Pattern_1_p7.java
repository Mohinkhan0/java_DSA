public class Pattern_1_p7 
{
    static void patern1(int currentrow)
    {
        if(currentrow==0)
        {
            return;
        }
        System.out.print("*");
        patern1(currentrow-1);
    }

    static void pattern(int row,int currentrow)
    {
        if(row==0)
        {
            return;
        } 
        System.out.println();
        patern1(currentrow);
        pattern(row-1,currentrow+1);
    }
    public static void main(String[] args) 
    {
        pattern(5,1);
    }
}
