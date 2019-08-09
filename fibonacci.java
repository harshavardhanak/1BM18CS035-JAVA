import java.util.*;
class fibonacci
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
   System.out.print("Enter the number ");
   int n=s.nextInt();
   int a=1;
   int b=1;
  int c;
int count=2;
while(count<n)
{
 c=b;
b=a+b;
a=c;
count++;
}
 System.out.print("nth term="+b);
}
}