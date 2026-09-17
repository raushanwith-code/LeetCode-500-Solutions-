import java.util.Scanner;
public class countNumbOfButifulSubArrays {

    public static void main(String[] args) {

        System.out.println("Enter Size Of Array:=");

        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        long count=0;

        int arr[]=new int[n];

        System.out.println("Enter Array Element:=");

        for (int i = 0; i < arr.length; i++) {

            arr[i]=Sc.nextInt();
            
        }

   for(int i=0; i<arr.length; i++){

    int xor=0;

    for(int j=i; j<arr.length; j++){

        xor ^=arr[j];

        if(xor==0){

            count++;
        }
    }
   }

   System.out.println("Final Ans is:="+ count);
        
    }
    
}
