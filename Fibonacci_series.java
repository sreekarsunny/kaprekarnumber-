import java.util.*;

class Fibonacci_series{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   int data1=0;
   int data2=1;
   int count=0;
   int temp=0;

   for(int i=2;i<number;i++)
   {
    System.out.println("__________________________________________________");
    temp=data1+data2;
    System.out.println(temp);
    count=0;
    for(int j=1;j<=temp;j++)
    {
     if(temp%j==0)
     {
      count++;
     }
     data1=data2;
     System.out.println(data1);
     data2=temp;
     System.out.println(data2);
     if(count==2)
     {
     System.out.println(temp);
     }
    }
}
}
}

    
    