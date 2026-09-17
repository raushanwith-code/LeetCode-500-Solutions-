import java.util.Scanner;

class MergSortedArray {

    public static void mergeSortedAray(int arr[], int brr[], int x, int y) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[x + y];

        // Merge karna
        while (i < x && j < y) {
            if (arr[i] <= brr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = brr[j++];
            }
        }

        // Agar arr mein elements bache ho
        while (i < x) {
            result[k++] = arr[i++];
        }

        // Agar brr mein elements bache ho
        while (j < y) {
            result[k++] = brr[j++];
        }

        // Print merged array
        System.out.println("Merged Sorted Array:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter elements of first array (sorted):");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int y = sc.nextInt();
        int brr[] = new int[y];
        System.out.println("Enter elements of second array (sorted):");
        for (int i = 0; i < y; i++) {
            brr[i] = sc.nextInt();
        }

        mergeSortedAray(arr, brr, x, y);
    }
}
