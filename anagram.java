                    import java.util.*;
                    class anagram
                    { 
                     public static void main(String[] args)
                     {
                       Scanner sc=new Scanner(System.in);
                       String str1=sc.nextLine();
                       String str2=sc.nextLine();
                       char[] ch1=new char[str1.length()];
                       char[] ch2=new char[str1.length()];
                       ch1=str1.toCharArray();
                       ch2=str2.toCharArray();
                       Arrays.sort(ch1); 
                       System.out.println(ch1);
                       Arrays.sort(ch2); 
                       System.out.println(ch2);
                       String str3=String.valueOf(ch1); 
                       System.out.println(str3);
                       String str4=String.valueOf(ch2);
                       System.out.println(str4);            
                       if(str1.length()==str2.length())
                       {
                       System.out.println(str1.length());
                       if(str3.equals(str4))
                       {
                        System.out.println("Anagram");
                       }
                       else
                       {
                       System.out.println("Not a anagram");
                       }
                       }
                       else{
                          System.out.println("Not a anagram");
                           }
}
}