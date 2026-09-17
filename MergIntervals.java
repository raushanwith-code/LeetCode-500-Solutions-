import java.util.*;

class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of intervals: ");
        int n = sc.nextInt();

        // Har interval ke liye 2 values (start, end)
        int[][] arr = new int[n][2];

        System.out.println("Enter the intervals (start end):");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // start
            arr[i][1] = sc.nextInt(); // end
        }

        // Merge logic call
        int[][] merged = merge(arr);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

    public static int[][] merge(int[][] intervals) {

        // Step 1: sort by start
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: traverse
        for (int[] interval : intervals) {
            
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval); // no overlap
            } else {
                // overlap → merge
                result.get(result.size() - 1)[1] = 
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: convert list to array
        return result.toArray(new int[result.size()][]);
    }
}
