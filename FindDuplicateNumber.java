import java.util.Scanner;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        
        System.out.println("Enter Your Array Size:=");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Array Element");

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();


        }

        System.out.println("Duplicate Number is:=");

        for (int i = 0; i < arr.length; i++) {  //  Time Complaxcity O(n^2)

            for(int j=i+1; j<arr.length; j++){ // Space Complexcity O(n^2)

                if(arr[i]==arr[j]){

                    System.out.println(arr[i]);
                }
            }
            
        }
    }
    
}


// HashSet O(n) to store Only uniqe

// import java.util.*;

// public class FindDuplicateNumber {

//     public static void main(String[] args) {
        
//         System.out.println("Enter Your Array Size:=");
//         Scanner Sc=new Scanner(System.in);
//         int n=Sc.nextInt();

//         int arr[]=new int[n];

//         System.out.println("Enter Array Element");

//         for(int i=0; i<arr.length; i++){

//             arr[i]=Sc.nextInt();

//         }

//         HashSet<Integer> ans =new HashSet<>();
//         boolean found=false;

//         for (int i = 0; i < arr.length; i++) {

//             if(ans.contains(arr[i])){

//                 System.out.println("Duplicate Number is;="+arr[i]);
//               found=true;
//               break;
//             }else{

//                 ans.add(arr[i]);
//             }
            
//         }
//         if(!found){
//             System.out.println("-1");
//         }

//     }
// }


// Same Array to Solution 

// import java.util.*;

// public class FindDuplicateNumber {

//     public static void main(String[] args) {
        
//         System.out.println("Enter Your Array Size:=");
//         Scanner Sc=new Scanner(System.in);
//         int n=Sc.nextInt();

//         int arr[]=new int[n];

//         System.out.println("Enter Array Element");

//         for(int i=0; i<arr.length; i++){

//             arr[i]=Sc.nextInt();

//         }

//         for(int i=1; i<arr.length; i++){

//             if(arr[i]==arr[i-1]){

//                 System.out.println(arr[i]);
//             }
//         }
//         System.out.println("-1");

//     }

// }



