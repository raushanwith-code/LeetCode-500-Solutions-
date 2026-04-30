import java.util.Scanner;
public class RotateImage {

    public static void RotateImage(int arr[][]){

        int n=arr.length;
        int m=arr.length;

        

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0; i<arr.length; i++){

            int left=0, right=arr.length-1;

            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter Your Array Size");
        Scanner Sc=new Scanner(System.in);
        int m=Sc.nextInt();
        int n=Sc.nextInt();

        int arr[][]=new int[m][n];

        System.out.println("Enter Your Array Element:=");

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

                arr[i][j]=Sc.nextInt();
            }
        }
     
        RotateImage(arr);

        System.out.println("your Final Roated Matrix is:=");

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
