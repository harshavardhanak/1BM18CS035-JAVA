import java.util.*;
import java.lang.Math.*;
class point
{
 int a,b,c,d;
   point()
  {
    a=0;b=0;c=0;d=0;
  }
   point(int a,int b,int c,int d)
  {
   this.a=a;
   this.b=b;
   this.c=c;
   this.d=d;
  }
  double distance()
  { double z;
    z= Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
   return z;
  }
}
class pointdemo
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 1st point which is stored in a&b ,2nd point stored in c&d");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int d=sc.nextInt();
   point ob1=new point();
   point ob2=new point(a,b,c,d);
   double distance=ob2.distance();
   System.out.println("Distance="+distance);
  }
}
