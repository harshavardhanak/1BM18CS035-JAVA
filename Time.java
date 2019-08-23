//harshavardhana k

import java.util.*;
class Timecalc
{
 int h,m,s;
 Timecalc()
 {
  h=0;
  m=0;
  s=0;
 }
 Timecalc(int h,int m,int s)
 {
  this.h=h;
  this.m=m;
  this.s=s;
 }
 void advance(int a,int b,int c)
 {
  h+=a;
  m+=b;
  s+=c;
  while(s>=60)
  {
   s-=60;
   m+=1;
  }
  while(m>=60)
  {
   m-=60;
   h+=1;
  }
  while(h>=24)
  {
   h-=24;
  }
 }
 void output()
 {
  System.out.println("The time is "+h+":"+m+":"+s);
 } 
 void reset(int a,int b,int c)
 {
  h=a;
  m=b;
  s=c;
 }
}
class Time
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the current time");
  int p=sc.nextInt();
  int q=sc.nextInt();
  int r=sc.nextInt();
  Timecalc t=new Timecalc(p,q,r);
  int sel,op;
  do
  {
   System.out.println("Choose an Option to perform:");
   System.out.println("1.Advance");    
   System.out.println("2.Output"); 
   System.out.println("3.Reset"); 
   op=sc.nextInt();
   
   switch(op)
   {
    case 1:{
    				System.out.println("Enter the time to advance to"); 
    				int a=sc.nextInt();
    				int b=sc.nextInt();
    				int c=sc.nextInt();
    				t.advance(a,b,c);
    				break;
    			 }
    case 2:{
    				t.output();
    				break;
    			 }
    case 3:{
    				System.out.println("Enter new time");
    				int x=sc.nextInt();
    				int y=sc.nextInt();
    				int z=sc.nextInt();
    				t.reset(x,y,z);
    				break;
    			 }
    default:System.out.println("Invalid option!");
   }
   System.out.println("Do you wish to continue?(press 1)");
   sel=sc.nextInt();
  }while(sel==1);
 }
} 
    					
    
    				             
