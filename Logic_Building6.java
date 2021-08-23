class A{
     final public int method(int a,int b){
     return 0;
     }
     }
class B extends A{
     public int method(int a,int b){
     return 1;
     }
    }

class Logic_Building6{
public static void main(String[] args)
{
  B b = new B();
  System.out.println("x="+b.method(0,1));
}
}  