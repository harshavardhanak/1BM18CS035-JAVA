import java.util.*;
class queue
 {
   Scanner sc=new Scanner(System.in);
   int front,rear;
   final int n=5;
   int[] a;
   queue()
     {  
        front=0;
        rear=-1;
        a=new int[n];
     }
   void insertion(queue ob)
    { 
      if(ob.rear==ob.n-1)
      {
        System.out.println("Queue is full");
      }
      else
      {
        System.out.println("Enter the element");
        int ele=sc.nextInt();
        ob.rear=ob.rear+1;
        ob.a[rear]=ele;
      }
    }
    void deletion(queue ob)
    {
      if(ob.front>ob.rear)
       {
         System.out.println("Queue is empty");
       }
      else
       {
         System.out.println("Deleted element is "+ob.a[front]);
         ob.front=ob.front+1;
       }
    }
    void display(queue ob)
    {
      if(ob.front>ob.rear)
       {
         System.out.println("Queue is empty");
       }
      else
       {
         System.out.println("Elements of queue ");
         for(int i=0;i<5;i++)
         System.out.println(ob.a[i]);
       }
    }
}
 class queuedemo
  { 
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       queue ob1=new queue();
       int i=1;
       while(i==1)
       {
         System.out.print("1.Insertion,2.Deletion,3.Display,4.Exit\n");
         System.out.println("Enter the choice\n");
         int c=sc.nextInt();
         switch(c)
           { 
              case 1: ob1.insertion(ob1);
                      break;
              case 2: ob1.deletion(ob1);
                      break;
              case 3: ob1.display(ob1);
                      break;
              case 4: i++;
           }
       }
    }
  }               
           
     
   
      
      
    
     