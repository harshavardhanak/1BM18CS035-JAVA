import java.util.*;
class Stud{
    String usn, name;
    int subs;
    double sgpa;
    double cre[] = new double[50];
    double marks[] = new double[50];
    Stud(int n){
        usn = "";
        name = "";
        subs = 0;
        sgpa = 0.0;
    }
    void input(int a){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name of the Student " + (a+1) + " - ");
        name = s.next();
        System.out.println("Enter the USN of " + name + " - ");
        usn = s.next();
        System.out.println("Enter the Number of Courses of " + name + " - ");
        subs = s.nextInt();
        for (int i = 0 ; i < subs ; i++){
            System.out.println("Enter the Credits and Marks (0-100) of Subject " + (i+1) + "-" );
            cre[i] = s.nextDouble();
            marks[i] = s.nextDouble();
        }
    }
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
    void calculate(){
        double sum = 0.0;
        double creditssum = 0.0;
        for (int j = 0 ; j < subs ; j++){
            sum += cre[j] * this.getgrade(marks[j]);
            cs += cre[j];
        }
        sgpa = sum/cs;
    }
    void display(){
        System.out.print("\nSGPA of " + name + "(" + usn + ")" + " is - ");
        System.out.printf("%4.2f%n", sgpa);
        System.out.print("\n");
    }
}
class student {
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Students");
        n = s.nextInt();
        Stud ele = new Stud(n);
        System.out.println("Entering the details of Students-");
        for (int k = 0 ; k < n ; k++){
            ele.input(k);
            ele.calculate();
            ele.display();
        }
    }
}