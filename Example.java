import java.util.*;

class Example{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  StringBuilder build = new StringBuilder(str);
  String str1="";
  String str2="";

  for(int i=0;i<str.length();i++)
  {
   if(str.charAt(0)=='a' || str.charAt(0)=='u' ||str.charAt(0)=='o' ||str.charAt(0)=='i' ||str.charAt(0)=='e' ||str.charAt(0)=='A' ||str.charAt(0)=='U' ||str.charAt(0)=='O' ||str.charAt(0)=='I' ||str.charAt(0)=='E')
   {
      System.out.println(str+"-"+"yay");
      break;
   }
   if(str.charAt(i)!='a' || str.charAt(i)!='u' ||str.charAt(i)!='o' ||str.charAt(i)!='i' ||str.charAt(i)!='e' ||str.charAt(i)!='A' ||str.charAt(i)!='U' ||str.charAt(0)!='i' ||str.charAt(i)!='I' ||str.charAt(i)!='E')
   {
      str1+=str.charAt(i);
      str2=build.deleteCharAt(i);
   }
  
    
}
System.out.println(build);

  
 }
}