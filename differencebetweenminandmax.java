import java.util.*;


class differencebetweenminandmax{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] input2=new int[5];
for(int i=0;i<input2.length;i++)
{
input2[i]=sc.nextInt();
}


int min=input2[0];
int max=0;

for(int i=0;i<input2.length;i++)
{
if(input2[i]<min)
{
  min=input2[i];
}
}
 
for(int i=0;i<input2.length;i++)
{
if(input2[i]>max)
{
  max=input2[i];
}
}
int diff=max-min;
System.out.println(diff);
}
}



 