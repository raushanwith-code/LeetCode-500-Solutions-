import java.util.Scanner;
public class SearchTwoDMatrix {

    public boolean SearchMatrix(int arr[][], int target){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j]==target){

                    return true;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enetr Your Array Size:=");

        Scanner Sc=new Scanner(System.in);
        int m=Sc.nextInt();
        int n=Sc.nextInt();

        System.out.println("Enter Your Target:=");
        int target=Sc.nextInt();

        int arr[][]=new int[m][n];

        System.out.println("Enter your Array Element");

        for (int i = 0; i < m; i++) {
            
            for(int j=0; j<n; j++){

                arr[i][j]=Sc.nextInt();
            }
        }

        SearchTwoDMatrix obj = new SearchTwoDMatrix();

       System.out.print( obj.SearchMatrix(arr,target));


        
    }
    
}
