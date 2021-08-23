import java.util.*;

class Plant
      {
       protected void grow()
       {
        System.out.println("plant is growing");
       }
      }
class Bamboo extends Plant
      {
      protected void grow()
       {
        System.out.println("Bamboo is growing");
       }
}
class Logic_Building4{
public static void main(String[] args)
{
   Plant P=new Plant();
   P.grow();
   Bamboo b=new Bamboo();
   b.grow();
}
}
