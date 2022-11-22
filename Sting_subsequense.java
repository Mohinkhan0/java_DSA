import java.util.ArrayList;
class Sting_subsequense 
{
    //it will calculate no of posible subsets of a given string;
    static ArrayList<String> subseq(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> empArraylist = new ArrayList<> ();  // arraylist
            empArraylist.add(" ");
            return empArraylist;
        }
        char currentchar= str.charAt(0);
        String remString=str.substring(1);
        ArrayList<String> temp = subseq(remString);
        ArrayList<String> result = new ArrayList<> ();
        for(String s : temp)
        {
           result.add(s);
           result.add(currentchar + s);
        }
        return result;
    }
   public static void main(String[] args)
   {
     String str="Ravi";
     ArrayList<String> s=subseq(str);
     System.out.println(s);

   }  
}
