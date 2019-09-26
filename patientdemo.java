import java.util.*;
class patient
 { 
   Scanner sc=new Scanner(System.in);
   String name,id,doc;
   int age;
   void getdata()
   {
    System.out.println("Enter the patient name,his/her id and age:");
    name=sc.next();
    id=sc.next();
    age=sc.nextInt();
    System.out.println("Enter 1 name of doctor:");
    doc=sc.next();
   }
   void display()
   {
   System.out.println("Name:\t"+name+"\nId:\t"+id+"\nAge:\t"+age+"\nDoctor:"+doc);
   }
 }
class patientdemo
 {
   public static void main(String args[])
    { 
     int i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of patients");
     int n=sc.nextInt();
     int a[]=new int[n]; 
     patient[] ob=new patient[n];
     for(i=0;i<n;i++)
     {
      ob[i]=new patient();
     }
     for(i=0;i<n;i++)
     {
      ob[i].getdata();
     }
     for(i=0;i<n;i++)
     {
      System.out.println("Patient\t"+(i+1)+" details:");
      ob[i].display();
     }
   }
 }
      
     
  
    
