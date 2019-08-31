import java.util.*;
class studAver {
    public static void main(String[] args){
        int stu, sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Students - ");
        stu = sc.nextInt();
        System.out.println("Enter the number of Subjects - ");
        sub = sc.nextInt();
        double arr[][] = new double[(stu+2)][(sub+2)];
        double total, average;
        int i, j;
        System.out.println("Entering the marks -\n");
        for (i = 0 ; i < stu ; i++){
            System.out.println("--------- Student " + (i+1) + " ---------");
            total = 0;
            for (j = 0 ; j < sub ; j++){
                System.out.println("Enter the Marks in subject " + (j+1));
                arr[i][j] = sc.nextDouble();
                total += arr[i][j];
            }
            arr[i][j] = total;
            average = total/sub;
            arr[i][++j] = average;
        }
        for (j = 0 ; j < sub ; j++){
            total = 0;
            for (i = 0 ; i < stu ; i++){
                total += arr[i][j];
            }
            arr[i][j] = total;
            average = total/stu;
            arr[++i][j] = average;
        }
        System.out.print("\nNow Displaying the results - \n\n_________| ");
        for (i = 1 ; i <= sub ; i++){
            String s = "S"+i;
            System.out.printf("%-9s", s);
        }
        System.out.print("Total      Average\n");
        for (i = 0 ; i < stu ; i++){
            System.out.printf("%-11s", "Student"+(i+1));
            for (j = 0 ; j < sub ; j++){
                System.out.printf("%-9.0f", arr[i][j]);
            }
            System.out.printf("%-11.1f", arr[i][j]);
            System.out.printf("%-9.1f%n", arr[i][++j]);
        }
        System.out.printf("%-11s", "Total");
        for (j = 0 ; j < sub ; j++){
            System.out.printf("%-9.1f", arr[i][j]);
        }
        System.out.printf("\n%-11s", "Average");
        i++;
        for (j = 0 ; j < sub ; j++){
            System.out.printf("%-9.1f", arr[i][j]);
        }
    }
}