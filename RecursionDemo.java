public class RecursionDemo 
{
    static void printnumber(int num)
    {
        if(num==0)
        {
            return ;
        }
     //   System.out.println(num);   it print decrisin orde 5 4 3 2 1 
        printnumber(num-1);
        System.out.println(num); //   OP 1 2 3 4 5
    }
    public static void main(String[] args)
    {
       printnumber(5);
    }
}
