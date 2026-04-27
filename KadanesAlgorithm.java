import java.util.Scanner;
import java.util.*;
public class KadanesAlgorithm {

    public static void main(String[] args) {
        
        System.out.println("Enter Size Of Araay:=");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enetr Your Array Element:=");

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }

        int  currSum=arr[0], maxSum=arr[0];  // CurrElement & MaxSum Store In Element 

        for(int i=1; i<arr.length; i++){

            currSum =Math.max(arr[i], currSum+arr[i]);   // Kadan's Algorithm O(n) Time

            maxSum=Math.max(maxSum, currSum);
        }

     System.out.println("Your Final Result is:=");
       

            System.out.println(maxSum);
        }

    }
    

