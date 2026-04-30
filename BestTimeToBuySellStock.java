import java.util.Scanner;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        
        System.out.println("Enter Your Array Size:=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int ele : arr) {
            if (ele < minPrice) {
                minPrice = ele;
            } else if (ele - minPrice > maxProfit) {
                maxProfit = ele - minPrice;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
