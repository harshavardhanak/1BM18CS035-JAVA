import java.util.*;

interface stack
 {
   void push();
   void pop();
   void display();
 }
  class dynamic implements stack{
   Scanner sc=new Scanner(System.in);
   int size=10; 
   int a[]=new int[size];
   int top=-1;
 public void push(){
   if(top==(size-1)){
    size=size*2;
    int[] temp=new int[size];
    for(int i=0;i<top;i++){
     temp[i]=a[i];
    }
   a=temp;
   }
   System.out.println("Enter the element");
   int ele=sc.nextInt();
   a[++top]=ele;
   }
   public void pop()
   {
    if(top==-1)
     {
      System.out.println("Stack is empty");
     }
    else
    {
     System.out.println("Deleted element = "+a[top]);
     top=top-1;
    }
    }
    public void display()
    {
     if(top==-1)
     {
      System.out.println("Stack is empty");
     }
     else
     {
      for(int i=0;i<size;i++)
      System.out.println(a[i]);
     }
   }
 }
class stackdemo{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    stack ob=new dynamic();
    int i=1;
    while(i==1){
    System.out.println("1.push,2.pop,3.display,4.exit\n");
    System.out.println("Enter the choice");
    int ch=sc.nextInt();
    switch(ch)
     {
       case 1:ob.push();
              break;
       case 2: ob.pop();
              break;
       case 3: ob.display();
              break;
       case 4:i++;
              break;
     }
    }
   }
 }      
    
    
  
  
