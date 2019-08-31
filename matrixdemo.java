import java.util.*;
class matrix
{
 int a,b,c,d;
 matrix()
 {
  a=0;b=0;c=0;d=0;
 }
 matrix(int a,int b,int c,int d)
 {
 this.a=a;
 this.b=b;
 this.c=c;
 this.d=d;
 }
 void inverse(int a,int b,int c,int d)
 { int x;
 this.a=a;
 this.b=b;
 this.c=c;
 this.d=d;
 x=a*d-b*c;
 System.out.println("Inverse of matrix ");
 System.out.println(d+"/"+x+"  "+-b+"/"+x);
 System.out.println(-c+"/"+x+"  "+a+"/"+x);
 }
 void determinant()
 {
 System.out.println("Determinant="+(a*d-b*c));
 }
}
class matrixdemo
{ 
  public static void main(String args[])
  {
  int x;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the elements of matrix");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int d=sc.nextInt();
 matrix ob1=new matrix(a,b,c,d);
 x=a*d-b*c;
 if(x!=0)
 { 
  ob1.inverse(a,b,c,d);
  ob1.determinant();
 }
 else
 System.out.println("It is singular");
 }
}
  
 