import java.util.Scanner;
public class nivan
{
 public static void main(String args[])
 {
  System.out.print("Enter number = ");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int s=0,t=n;
  while(n>0)
  {
     s+=(n%10);
     n/=10;
     }
  if(t%s==0)
    System.out.println("\tNivan number");
  else
    System.out.println("\tNot Nivan number");
}}

