//Harshavardhana k
1BM18CS035
import java.util.*;
class area{
	
	int length;
	int width;
	int area;

	void input()
	{ Scanner s=new Scanner(System.in);
	System.out.println("enter the length and width");
	length=s.nextInt();
	width=s.nextInt();
	}

	void output()
	{ area=length*width;
	System.out.println("the length and width given respectively are : " + length + " and " + width + " hence the area is " + area);
	}
}

class rectangledemo{
	public static void main(String[] args){
		Rectangle rec1;
		rec1=new Rectangle();
		Rectangle rec2;
		rec2=new Rectangle();
	
		rec1.input();
		rec2.input();
		rec1.output();
		rec2.output();
	}
}