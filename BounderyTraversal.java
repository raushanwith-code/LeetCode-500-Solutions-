import java.util.Scanner;
public class BounderyTraversal {

    public static void main(String[] args) {

        System.out.println("Enter Your Matrix Row");
        Scanner Sc=new Scanner(System.in);
        int rowSize=Sc.nextInt();

        System.out.println("Enter Matrix Col");
        int colSize=Sc.nextInt();

        int Matrix[][]=new int[rowSize][colSize];

        int m=Matrix.length;
        int n=Matrix[0].length;


        System.out.println("Enter Matrix Element");

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                Matrix[i][j]=Sc.nextInt();
            }
        }

        System.out.println("Final Matrix Colwise");

            for(int j=0; j<n; j++){

                System.out.print(Matrix[0][j]+" ");
     
            }

            // Right Coloumn
            for(int i=1; i<m; i++){
                System.out.print(Matrix[i][n-1]+" ");

            }

            // bottom Row (Right to left)

            for(int j=n-2; j>=0; j--){
                System.out.print(Matrix[m-1][j]+" ");
            }

            // Left Column 

            for(int i=m-2; i>=1; i--){
                System.out.print(Matrix[i][0]+" ");
            }


        }

        
    }
    

    

