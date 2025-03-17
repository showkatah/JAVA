import java.util.*;
public class rev_string
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   int n=s.length();
   rev(s,--n);
   System.out.println();
 }
 static int rev(String s,int n)
 { 
   if(n>=0)
    {
      System.out.print(String.valueOf(s.charAt(n)));
      rev(s,--n);

   }
   return 0;
 }
}

