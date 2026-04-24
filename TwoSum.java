import java.util.Scanner;
class TwoSum{   

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter Your Array Size:=");  // Size of Array
        int n=Sc.nextInt();

        System.out.println("Enter Your Target Element:="); // target Element to find in Array
        int target=Sc.nextInt();

        System.out.println("Enter Your Array Element:="); //Array Element to find in Array

        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {  // Input Array Element from user

            arr[i]=Sc.nextInt();
            
        }

        System.out.println("Your final Taget Element Result is:=");
        boolean flag=false;

        for(int i=0; i<arr.length; i++){
            
            for(int j=i+1; j<arr.length; j++){   // 0(n^2) time complexity

                if(arr[i]+arr[j]==target){

                   System.out.println("{"+i+" "+j+"}");
                   flag=true;
                }
            }
           
            }
             if(!flag){                         // if target element is not fund in array then print -1
                System.out.println("-1");

        }
        Sc.close();
    }
}

//Hashmap Solution for Two sum problem 0(n) Time complexity

//  import java.util.*;
//  class TwoSumLc{

//     public static void main(String[] args) {

//         Scanner Sc=new Scanner(System.in);
//         System.out.println("Enter Your Array Element:=");
//         int n=Sc.nextInt();

//         System.out.println("Enter Your Target Element:=");
//         int target=Sc.nextInt();

//         int arr[]=new int[n];

//         System.out.println("Enetr your Array Elements:=");

//         for(int i=0; i<arr.length; i++){

//             arr[i]=Sc.nextInt();
//         }

//         System.out.println("Final ans Using HashMap:=");

//         HashMap<Integer, Integer> map=new HashMap<>();
//         boolean flag=false;

//         for(int i=0; i<arr.length; i++){

//             int complement =target-arr[i];

//             if(map.containsKey(complement)){

//                 System.out.println("{"+map.get(complement)+" "+i+"}");
//                 flag=true;
//                 break;
//             }

//             map.put(arr[i], i);


//         }

//         if(!flag){

//             System.out.println("-1");
//         }
        
//         Sc.close();
//     }

// }