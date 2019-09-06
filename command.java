import java.util.*;
class command
{
 public static void main(String args[])
 {
  int sum=0,i;
 int a[]=new int[args.length];
  for(i=0;i<args.length;i++)
  {
   a[i]=Integer.parseInt(args[i]);
  }
   int large=a[0];
  for(i=1;i<args.length;i++)
  {
   if(a[i]>large)
   {
   large=a[i];
   }
  }
  System.out.println("Large="+large);
 }
}
