import java.util.Scanner;
import java.util.ArrayList;
class FindMissingRepeatValues{

    public static void main(String[] args) {

        System.out.println("Enter Your Array Size:=");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();

        int arr[][]=new int[n][n];
        ArrayList<Integer> ans=new ArrayList<>();

        System.out.println("Enter Arrays Element:=");

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

                arr[i][j]=Sc.nextInt();
                ans.add(arr[i][j]);

            }
        }

        int size= n*n;

        int [] freq=new int[size+1];
        int repeat=-1, missing=-1;

        for(int val: ans){

            freq[val]++;
        }

        for(int i=1; i<=size; i++){

            if(freq[i]==0) missing=i;
            if(freq[i]>1) repeat=i;
        }

        System.out.println("Repeated"+" "+repeat);
        System.out.println("Missing"+" "+missing);

       
            }
        }
        
   