import java.util.*;

class Logic_Building{
public static void main(String[] args){
int i=1;
int j=10;
do{
 if(i>j){
     break;
     }
j--;
}
while(++i<5);

System.out.println(i+" "+j);
}
}
