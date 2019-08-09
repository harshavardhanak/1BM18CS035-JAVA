import java.util.*;
class quadratic
{
 public static void main(String args[])
          {
           Scanner s=new Scanner(System.in);
           System.out.print("Enter the values a ,b and c :");
           int a=s.nextInt();
           int b=s.nextInt();
           int c=s.nextInt();
           int d=(b*b-4*a*c);
            if(d==0)
       {
             System.out.print("Roots are equal");
             float r1=-b/(2*a);
             System.out.print("R1= "+r1+" R2= "+r1);
       }
             else if(d>0)
       { 
             System.out.print("Roots are real and distinct");
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.print("R1= "+r1+" R2= "+r2);
        }
          else
          System.out.print("Roots are imaginary");
 

          }
}