import java.util.HashSet;
import java.util.Scanner;
class LongestconsecutiveSequence{


    public static int longestConsecutiveSequence(int arr[]){

        if(arr.length==0) return 0;

        HashSet<Integer> set=new HashSet<>();

        for(int ele: arr){

            set.add(ele);
        }

        int longest=0;

        for(int ele: set){

            if(!set.contains(ele-1)){

                int currentNum=ele;
                int currentStreak=1;

                while(set.contains(currentNum+1)){

                    currentNum++;
                    currentStreak++;
                }

                longest=Math.max(longest, currentStreak);

            }
        }

        return longest;
    }

    public static void main(String[] args) {

        System.out.println("Enter Array Size");

        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Array Element:=");

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }
 
        System.out.println("Final Length is:="+longestConsecutiveSequence(arr));

        
    }
}