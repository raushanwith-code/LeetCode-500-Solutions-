import java.util.*;
public class MajorityElement {

    public static void main(String[] args) {

        System.out.println("Enter Array Size:=");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        

        int arr[]=new int[n];

        System.out.println("Enter Array Element");

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();

        }
        int mejority=-1;

        for(int i=0; i<arr.length; i++){

            int count=0;

            for(int j=0; j<arr.length; j++){

                if(arr[i]==arr[j]){

                    count++;
                }

            }

            if(count>arr.length/2){
                mejority=arr[i];
                break;
            }
        }
        
         if (mejority != -1) {
            System.out.println("Majority Element = " + mejority);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
    }
    

