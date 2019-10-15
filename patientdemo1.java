import java.util.*;
class patient
 { 
   Scanner sc=new Scanner(System.in);
   String name,id;
   int age,d;
   void getdata()
   {
    System.out.println("Enter the patient name,his/her id and age:");
    name=sc.next();
    id=sc.next();
    age=sc.nextInt();
    System.out.println("Enter 1 for raghu and 2 for venky :");
    d=sc.nextInt();
   }
   void display()
   {
   System.out.println("Name:\t"+name+"\nId:\t"+id+"\nAge:\t"+age);
   }
 }
class patientdemo1
 {
   public static void main(String args[])
   { 
     int i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of patients");
     int n=sc.nextInt();
     int a[]=new int[n]; 
     patient ob[]=new patient[n];
     for(i=0;i<n;i++)
     {
      ob[i]=new patient();
      ob[i].getdata();
     }
     for(i=0;i<n;i++)
     {
      ob[i].display();
     } 
     System.out.println("Enter 1 for the patients under doctor raghu or 2 for doctor venky   ");
     int ch=sc.nextInt();     
     switch(ch)
        {
          case 1:System.out.println("patients under Doctor raghu");
                  for(i=0;i<n;i++)
                   {
                     if(ob[i].d==1){
                      System.out.println(ob[i].name);}
                   }
                  break;
          case 2:System.out.println("patients under Doctor venky");
                   for(i=0;i<n;i++)
                   {
                     if(ob[i].d==2){
                      System.out.println(ob[i].name);}
                   }
                  break;
        }
   }
 }