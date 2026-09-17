import java.util.Scanner;
class twoDiArrayTriversal{

    public static void main(String[] args) {
        
    
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter RowSize Element:-");
        int rowSize=Sc.nextInt();

         System.out.println("Enter colSize");
        int colSize=Sc.nextInt();

        int Matrix[][]=new int[rowSize][colSize];

        System.out.println("Enter Matrix Element:=");
        
        int m=Matrix.length;
        int n=Matrix[0].length;

        for (int i = 0; i < m; i++) {

            for(int j=0; j<n; j++){

                Matrix[i][j]=Sc.nextInt();
            }
            
        }

        System.out.println("Print  Matrix rowWise:=");

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                System.out.print(Matrix[i][j]+" ");

            }
           
        }

         System.out.println(" print Final Matrix :=");

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                System.out.print(Matrix[i][j]+" ");

            }

            System.out.println();
           
        }
    }
}