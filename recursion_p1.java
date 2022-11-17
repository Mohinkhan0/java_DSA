class recursion_p1
{
   static void recurse(int x)
    {
      if(x==0)
      {
        return;
      }
      if(x%2!=0)
      {
      System.out.println(x);
      }
      recurse(x-1);
      if(x%2==0)
      {
          System.out.println(x);
      }
     
    }
    public static void main(String[] args) 
    {
        recurse(5);
    }
}
/*
5
3
1
2
4
 */