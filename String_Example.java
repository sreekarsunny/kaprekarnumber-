import java.util.*;

class String_Example{

    public static void main(String[] args)
    {
     
    Scanner sc=new Scanner(System.in);
    String[] str=new String[100];
    int num=sc.nextInt();
    for(int i=0;i<=num;i++)
    {
    str[i]=sc.nextLine();
    }
for(int i=0;i<num;i++)
{
System.out.print(str[i]+" ");
}

System.out.print(str[3]+" ");
}
}