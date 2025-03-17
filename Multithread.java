import java.util.*;
class Mythrd implements Runnable
{
 String str;
 Mythrd(String str)
 {
  this.str=str;
 }
 public void run()
 {
  for(int i=0;i<4;i++)
  {
    System.out.println(str +" : "+ i);
   try
   {
     Thread.sleep(2000);
   }
   catch(InterruptedException e)
   {
    e.printStackTrace();
   }
  }
 }
}

public class Multithread
{
  public static void main(String args[])
  {
      System.out.println("TESTING");
    Mythrd ob1 = new Mythrd("Cut the ticket");
    Mythrd ob2 = new Mythrd("Show the ticket");
    Thread t1 =new Thread(ob1);
    Thread t2 =new Thread(ob2);
    t1.start();
    t2.start();
   }
}
