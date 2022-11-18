public class Pattern2_p8
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
    static void paTtern2(int row)
    {
        if(row==0)
        {
            return;
        }
        System.out.print(" ");
        patern1(row);

    }

    static void pattern(int row,int currentrow)
    {
        if(row==0)
        {
            return;
        } 
   //    paTtern2(row);
        System.out.println();
       patern1(currentrow);
        pattern(row-1,currentrow+1);
    }
    public static void main(String[] args) 
    {
        pattern(5,1);
    }
}

// *
// **
// ***
// ****
// *****