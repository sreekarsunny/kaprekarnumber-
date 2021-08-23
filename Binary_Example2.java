import java.util.*;

class Binary_Example2{




    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int[] arr=new int[35];
     int i=0;
     while(num>0)
     {
      arr[i++]=num%2;
      num=num/2;
      System.out.println(arr[i]);
     }
     for(int j=i-1;j>0;j--)
     {
      System.out.print(arr[j]);
     }
}
}