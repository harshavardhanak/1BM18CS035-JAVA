import java.util.*;
class customer
  {
    Scanner sc=new Scanner(System.in);
    private String name;
    private int number,quantity;
    private double price,totalprice,discount,netprice;
    customer()
    {
      System.out.println("Enter the name of customer:");
      name=sc.next();
      System.out.println("Enter the phone number of customer:");      
      number=sc.nextInt();
    }
    void input()
    {
      System.out.println("Enter the price and quantity");
      price=sc.nextDouble();
      quantity=sc.nextInt();
      totalprice=price*quantity;
    }
    void discount()
    { 
      if((totalprice>=25000)&&(totalprice<50000))
        {
          discount=0.25*totalprice;
          netprice=totalprice-discount;
        }
      else if(totalprice>=50000)
        {
          discount=0.1*totalprice;
          netprice=totalprice-discount;
         }
       else
        {
          netprice=totalprice;
        }
    }
    void display()
     {
      System.out.println("Name:"+name);      
      System.out.println("Number:"+number);
      System.out.println("Total_price:"+totalprice);
      System.out.println("Discount:"+discount);
      System.out.println("Net price to be paid:"+netprice);
     }
}
 class customerdemo
   {
     public static void main(String args[])
      {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers");
        int n=sc.nextInt();
        customer ob[]=new customer[n];
        for(i=0;i<n;i++)
         {
           ob[i]=new customer();
           ob[i].input();
           ob[i].discount();
         }
        for(i=0;i<n;i++)
         {
           ob[i].display();
         }
       }
   }
     