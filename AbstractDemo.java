import java.util.*;
import java.lang.Math.*;


abstract class Shape
    {
    int a,b;
    abstract void printarea();
    }

class Rectangle extends Shape
    {
    void printarea()
	{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter length and breadth:");
	a=se.nextInt();
	b=se.nextInt();
	int area=a*b;
	System.out.println("The area of the rectangle is:"+area);
	}
    }

class Triangle extends Shape
    {
    void printarea()
	{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter height and base:");
	a=se.nextInt();
	b=se.nextInt();
	float area=(a*b)/2;
	System.out.println("The area of the triangle is:"+area);
	}
    }

class Circle extends Shape
    {
    void printarea()
	{
	float f=(float)Math.PI;
	Scanner se=new Scanner(System.in);
	System.out.println("Enter radius:");
	b=se.nextInt();
	float area=f*b*b;
	System.out.println("The area of the circle is:"+area);
	}
    }

class AbstractDemo
    {
    public static void main(String args[])
	{
	Scanner se=new Scanner(System.in);
	int n=-1;
	while(n!=0)
	    {
	    System.out.println("Enter your choice:");
	    System.out.println("1=Rectangle\n2=Triangle\n3=Circle\n0=exit");
	    n=se.nextInt();
	    switch(n)
	    	{
		case 1:Shape ob=new Rectangle();
			ob.printarea();
		 	break;
		case 2:	Shape ob1=new Triangle();
			ob1.printarea();
			break;
		case 3:Shape ob2=new Circle();
			ob2.printarea();
			break;
		default:System.out.println("Enter a valid number");
			break;
		}
	    }
	}
    }













