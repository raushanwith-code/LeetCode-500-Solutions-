import java.util.Scanner;
public class ZigZagTriversal {
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

            if(i%2==0){
                for(int j=0; j<m; j++){
                    System.out.print(Matrix[i][j]+" ");
                }
            }else{
                
                for(int j=n-1; j>=0; j--){
                    System.out.print(Matrix[i][j]+" ");
                }
            }
           }

    }

    
}
