import java.util.Scanner;


public class Array_Scanner 
{

    public static void main(String[] args) {
        
Scanner Sc=new Scanner(System.in);
System.out.println("enter any number");
int num=Sc.nextInt();
int arr[]=new int[num];
for(int i=0; i<num; i++)
{
    arr[i]=Sc.nextInt();
}

System.out.println("=====================================");

for(int i=0; i<num; i++)
{
   System.out.print(" "+arr[i]);
}
    }

}
