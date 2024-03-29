import java.util.*;
class Matrix{
    double det;
    Scanner s = new Scanner(System.in);
    int arr[][] = new int[2][2];
    
    Matrix(){
        det = 0;
        System.out.println("Enter the elements of the 2 X 2 Matrix -");
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = s.nextInt();
            }
        }
    }
    Matrix(Matrix ob){
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = ob.arr[i][j];
            }
        }
    }
    
    double determinant(){
        det = (( arr[0][0] * arr[1][1] ) - ( arr[0][1] * arr[1][0] ));
        return det;
    }
    
    void inverse(){
         int temp = mat[0][0];
         mat[0][0] = mat[1][1];
         mat[1][1] = temp;  
         mat[0][1] -= 2 * mat[0][1];
         mat[1][0] -= 2 * mat[1][0];
            
    }
    boolean isSingular(){
        determinant();
        if(det == 0){
            return true;
        }
        else{
            return false;
        }
    }
    void print(){
        for(int a[]:arr){
            for(int x:a){
                System.out.print(x + "  ");
            }
            System.out.print("\n");
        }
    }
}

class matrixDemo {
    public static void main(String args[]){
        Matrix ob1 = new Matrix();
        Matrix ob2 = new Matrix(ob1);
        
        System.out.println("The Matrix Object created using zero argument instructor is -");
        ob1.print();
        System.out.println("The Matrix Object created using copy instructor is - ");
        ob2.print();
        System.out.println("The Determinant is - " + ob1.determinant());
        if (ob1.isSingular() == true){
            System.out.println("The Matrix is Singular");
        }
        else{
            System.out.println("The Matrix is non-Singular");
        }
        
        ob1.inverse();
        System.out.println("The Inverse Matrix is - ");
        ob1.print();
    }
}
