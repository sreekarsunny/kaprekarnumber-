import java.util.*;

class Find_Number{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int Count_num=sc.nextInt();
int num=sc.nextInt();
int count=0;
int number=0;
   while(num>0){
      number=num%10;
      if(number==Count_num)
      {
       count++;
      }
      num=num/10;
     }
System.out.println(count);

}
}
      