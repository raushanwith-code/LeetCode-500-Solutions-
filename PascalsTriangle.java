import java.util.Scanner;
import java.util.ArrayList;
public class PascalsTriangle {

    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter your NumRow");
        int numRows=Sc.nextInt();

        ArrayList<ArrayList<Integer>> ans=new  ArrayList<>();   // List Of Lists Create To store Final Return ans 

        //First Row
        ArrayList<Integer> firstRow=new ArrayList<>();   // List to fist Element add in triangle
        firstRow.add(1);
        ans.add(firstRow);

        //Build the Tringle
        for(int i=1; i<numRows; i++){
            ArrayList<Integer> prevRow=ans.get(i-1);
            ArrayList<Integer> newRow= new ArrayList<>();

            newRow.add(1); //First Element

            for(int j=1; j<i; j++){
                newRow.add(prevRow.get(j-1)+prevRow.get(j));  //Add your Elelment Prev and next Element 
            }

            newRow.add(1);
            ans.add(newRow);
        }

        //pritn thr Tringle

        System.out.println("Your Final Ans is:");

        for(ArrayList<Integer>row: ans){
            for(int num: row){
                System.out.print(num+" ");  //Finally Print Your Pascal's Tringle 
            }
            System.out.println();

        }
    }
    
}


// Only using Single Array To print Pascal's Triangle

// import java.util.Scanner;

// class PascalsTriangle{

//     public static void main(String[] args) {
//          Scanner Sc=new Scanner(System.in);

//         System.out.println("Enetr Your RowNumber");
//         int Rownum=Sc.nextInt();

//         int arr[]=new int[Rownum];
//         arr[0]=1;

//         for(int i=0; i<Rownum; i++){

//             int curr[]=new int[Rownum];
//             curr[0]=1;
//             curr[i]=1;

//             for(int j=1; j<i; j++){

//                 curr[j]=arr[j-1]+arr[j];
//             }

//              System.out.println("Your Final Ans is:");

//             for(int j=0; j<=i; j++){
//                 System.out.print(curr[j]+" ");
//             }
//             System.out.println();
//             arr=curr;
//         }
//     }
// }


// Final Dp Concept Using To Solve Easy To UndreStand 

// import java.util.Scanner;

// public class PascalsTriangleDP {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int numRows = sc.nextInt();

//         int[][] dp = new int[numRows][numRows];

//         // Base case
//         for (int i = 0; i < numRows; i++) {
//             dp[i][0] = 1;   // first element
//             dp[i][i] = 1;   // last element
//         }

//         // Fill DP table
//         for (int i = 2; i < numRows; i++) {
//             for (int j = 1; j < i; j++) {
//                 dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
//             }
//         }

//         // Print Pascal's Triangle
//         for (int i = 0; i < numRows; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
