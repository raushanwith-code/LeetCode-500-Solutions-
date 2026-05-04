import java.util.*;

public class CountNumberOfInversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size (n):");
        int n = sc.nextInt();   // size of matrix (n x n)

        int arr[][] = new int[n][n];
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int inversions = countNumberInversion(arr, n);
        System.out.println("Total Inversions = " + inversions);
    }

    // Flatten 2D array and count inversions
    public static int countNumberInversion(int arr[][], int n) {
        int size = n * n;
        int[] flat = new int[size];
        int idx = 0;

        // Flatten matrix into 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flat[idx++] = arr[i][j];
            }
        }

        // Count inversions using merge sort
        return mergeSortAndCount(flat, 0, size - 1);
    }

    // Merge sort with inversion count
    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
        int mid = (left + right) / 2;

            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left, swaps = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (mid + 1) - (left + i); // count inversions
            }
        }

        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];

        return swaps;
    }
}
