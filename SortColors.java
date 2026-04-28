import java.util.Scanner;
class SortColors{

    public static void main(String[] args) {
        
        System.out.println("Enter your Array Size:=");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();

        int arr[]=new int[n];
     
        System.out.println("Enter Your Array Element:=");
        for(int i=0; i<arr.length; i++){
            arr[i]=Sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[i]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        System.out.println("Final Result IS:=");
         for(int ele: arr){
                System.out.print(ele+" ");
            }
    }
}