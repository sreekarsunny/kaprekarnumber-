import java.util.*;

class PatternExample
  {
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   
   for(int i=num-1;i>0;i--)
   {
    for(int j=0;j<i;j++)
    {
     System.out.print(" ");
    }
    System.out.println();
   }

   
}
}