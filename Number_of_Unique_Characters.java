 import java.util.*;

class Number_of_Unique_Characters
      {
      public static void main(String[] args)
      {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String str2;
       int len=str.length();
       char[] arr=new char[len];
       arr=str.toCharArray();
       for(int i=0;i<len;i++)
       {
           for(int j=0;j<len;j++)
           {
             if(i==j)
             {
              continue;
             }
             else if(arr[i]==arr[j])
             {
                  arr[j]='o';
             }
           }
       }
       str2=String.valueOf(arr);
       String replaceString=str2.replace('o',' ');//replaces all occurrences of 'a' to 'e'
       char[] arr1=new char[len];
       arr1=replaceString.toCharArray();
        System.out.println(arr1);
       String str3=String.valueOf(arr1);
       System.out.println(str3);
}
}  