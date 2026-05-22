import java.util.Scanner;
class SubarraySumEqualsK{

    public static void main(String[] args) {
        
        System.out.println("Enter Array Size ");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int count=0;

        System.out.println("Enter target Element");
        int target=Sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Array Element:=");
        
        for(int i=0; i<arr.length; i++){

             arr[i]=Sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            int sum=0;

            for(int j=i; j<arr.length; j++){

                sum +=arr[j];

                if(sum==target){

                    count++;
                }


            }
        }

        System.out.println("Final result is:="+count);
    }
}