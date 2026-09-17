import java.util.Scanner;
public class colmunWiseTriversal {

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

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                if(i+j==n-1)

                System.out.print(Matrix[i][j]+" ");
            }
        }

        
    }
    
}
