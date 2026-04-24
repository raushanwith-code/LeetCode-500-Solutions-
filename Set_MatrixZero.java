import java.util.Scanner;
public class Set_MatrixZero {


    public static void Set_MatrixZero(){

         Scanner Sc=new Scanner(System.in);
        
        System.out.println("Enter Your Row & Coloumn Size:=");
        int row=Sc.nextInt();
         int column=Sc.nextInt();

        
        int brr[][]=new int[row][column];
        int copy[][]=new int[row][column];

        System.out.println("Enter Your Array Element:=");
        for (int i = 0; i < row; i++) {
           
            for(int j=0; j<column; j++){

                brr[i][j]=Sc.nextInt();
                copy[i][j]=brr[i][j];   //create a copy array
                
            }
        }


        for(int i=0; i<row; i++){

            for(int j=0; j<column; j++){

                if(copy[i][j]==0){

                    for(int k=0; k<column; k++) brr[i][k]=0; // Column all Element are Zero

                    for(int k=0; k<row; k++) brr[k][j]=0;  // Row all Element are Zero


                }
            }
        }

        System.out.println("Final SetMatrix is:=");

        for(int i=0; i<row; i++){

            for(int j=0; j<column; j++){  

                System.out.print(brr[i][j]+" ");   //Print the Final SetmatrixZero Element
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Set_MatrixZero();
       
      
    }
    
}

// Optimize Solution Of Set_MatrixZero Problem


// import java.util.Scanner;

// class Solution {
//     public void setZeroes(int[][] brr) {
//         int row = brr.length;
//         int col = brr[0].length;

//         boolean firstRowZero = false;
//         boolean firstColZero = false;

//         // Check if first row has zero
//         for (int j = 0; j < col; j++) {
//             if (brr[0][j] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }

//         // Check if first column has zero
//         for (int i = 0; i < row; i++) {
//             if (brr[i][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }

//         // Use first row and column as markers
//         for (int i = 1; i < row; i++) {
//             for (int j = 1; j < col; j++) {
//                 if (brr[i][j] == 0) {
//                     brr[i][0] = 0;
//                     brr[0][j] = 0;
//                 }
//             }
//         }

//         // Set zeroes based on markers
//         for (int i = 1; i < row; i++) {
//             for (int j = 1; j < col; j++) {
//                 if (brr[i][0] == 0 || brr[0][j] == 0) {
//                     brr[i][j] = 0;
//                 }
//             }
//         }

//         // Handle first row
//         if (firstRowZero) {
//             for (int j = 0; j < col; j++) {
//                 brr[0][j] = 0;
//             }
//         }

//         // Handle first column
//         if (firstColZero) {
//             for (int i = 0; i < row; i++) {
//                 brr[i][0] = 0;
//             }
//         }
//     }
// }

// public class Set_MatrixZero {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter rows and columns:");
//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int[][] matrix = new int[row][col];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         Solution sol = new Solution();
//         sol.setZeroes(matrix);

//         System.out.println("Final SetMatrix is:");
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
