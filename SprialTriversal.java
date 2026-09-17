import java.util.Scanner;
public class SprialTriversal {

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

        int top=0;
        int botom=m-1;
        int left=0;
        int right=n-1;

        System.out.println("Sprial Traversal");

        while(top<=botom && left<=right){

            for(int j=left; j<=right; j++){
                System.out.print(Matrix[top][j]+" ");

            }
            top++;

            // Right Coloumn

            for(int i=top; i<=botom; i++){

                System.out.print(Matrix[i][right]+" ");
            }
            right--;

            if(top<=botom){
                for(int j=right; j>=left; j--){
                    System.out.print(Matrix[botom][j]+" ");
                }
                botom--;
            }
            if(left<=right){

                for(int i=botom; i>=top; i--){
                    System.out.print(Matrix[i][left]+" ");
                }
                left++;
            }
        }
        Sc.close();
    }
    
}
