import java.util.*;

class NextPermution {

    public static void nextPermutation(int arr[]) {
        int n = arr.length;

        // Step 1: Find pivot
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find successor
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap pivot and successor
            swap(arr, i, j);
        }

        // Step 4: Reverse suffix
        reverse(arr, i + 1, n - 1);
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse helper
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Size Of Your Array:=");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Your Array Element:=");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Final Result is:=");

        nextPermutation(arr);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
