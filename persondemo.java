import java.util.*;
class person
  {
    Scanner sc=new Scanner(System.in);
    String name,address;
    int age;
    void getdata()
    {
      System.out.println("Enter the name,address and age of student");
      name=sc.next();
      address=sc.next();
      age=sc.nextInt();
    }
    void display()
    {
      System.out.println("Name:  "+name);
      System.out.println("Age:  "+age);
      System.out.println("Address:  "+address);
    }
  }
class student extends person
  {
    Scanner sc=new Scanner(System.in);
    String sem;
    int roll;
    void getdata()
    {
      super.getdata();
      System.out.println("Enter the roll number and sem");
      roll=sc.nextInt();
      sem=sc.next();
    }
    void display()
    {
       super.display();
       System.out.println("Roll Number:  "+roll);
       System.out.println("Sem:  "+sem);
    }
  }
class exam extends student
  {
    Scanner sc=new Scanner(System.in);
    int m1,m2;
    double ave;
    void getdata()
    {
      super.getdata();
      System.out.println("Enter the m1 and m2 marks");
      m1=sc.nextInt();
      m2=sc.nextInt();
      ave=(m1+m2)/2;
    }
    void display()
    {
      super.display();
      System.out.println("Average:  "+ave);
    } 
  }
class persondemo
  {
    public static void main(String args[])
      {
        int k=0,i;
        double temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of students");
        int n=sc.nextInt();
        exam ob[]=new exam[n];
        for(i=0;i<n;i++)
        {
          ob[i]=new exam();
          ob[i].getdata();
        }
        for(i=0;i<n;i++)
        {
          ob[i].display();
        }
        temp=ob[0].ave;
        for(i=1;i<n;i++)
        {
           if(temp<ob[i].ave){
           k=i;}
        }
        System.out.println("Topper of the class :  "+ob[k].name);
      }
  }
           
          
        
      
      