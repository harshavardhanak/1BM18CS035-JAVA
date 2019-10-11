import java.util.*;
class student
{
  Scanner sc=new Scanner(System.in); 
  String usn,name;
  int sem;
  void getdata()
   {
    System.out.println("Enter the name,usn and sem");
    name=sc.next();
    usn=sc.next();
    sem=sc.nextInt();
   }
  void display()
   {
    System.out.println("Name:  "+name+"  USN:  "+usn+"  Sem:  "+sem);
   }
 }
 class test extends student
  {
    int i;
    int m[]=new int[5];
    int c[]=new int[5];
    void getdata()
      {
        super.getdata();
        System.out.println("Enter the marks(out of 50) and credits of subjects");
        for(i=0;i<5;i++)
          {
           m[i]=sc.nextInt();
           c[i]=sc.nextInt();
          }
       }
     void display()
      {
        super.display();
      }
   }
  class exam extends test
   {
      int i;
     int s[]=new int[5];
     void getdata()
     {
       super.getdata();
       System.out.println("Enter see marks");
       for(i=0;i<5;i++)
        {
          s[i]=sc.nextInt();
        }
      }
   }
  class result extends exam
   {
     double cs,sgpa;
     double e[]=new double[5];
     double getgrade(double x){
        if (x<40){
            return 0;
        }
        else if ((x>=40)&&(x<45)){
            return 4;
        }
        else if ((x>=45)&&(x<50)){
            return 5;
        }
        else if ((x>=50)&&(x<60)){
            return 7;
        }
        else if ((x>=60)&&(x<75)){
            return 8;
        }
        else if ((x>=75)&&(x<90)){
            return 9;
        }
        else if ((x>=90)&&(x<100)){
            return 10;
        }
        return 0;
    }
    void display(){
            super.display();
             for(i=0;i<5;i++)
          {
             e[i]=s[i]+m[i];
          }
        double sum = 0.0;
        double creditssum = 0.0;
        for (int i = 0 ; i < 5 ; i++){
            sum += c[i] * this.getgrade(e[i]);
            cs += c[i];
        }
        sgpa = sum/cs;
        
        System.out.println("SGPA:"+sgpa);
    }
  }
 class studentdemo
   {
     public static void main(String args[])
       {
        int i;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of studnts");
         int sn=sc.nextInt();
         result ob[]=new result[sn];
          for(i=0;i<sn;i++)
           {
             ob[i]=new result();           
           }
          for(i=0;i<sn;i++)
           {
             ob[i].getdata();
           }
          for(i=0;i<sn;i++)
          {
           ob[i].display();
          }
       }
  }