import java.util.Scanner;

class UniquePath {

    // Recursive brute force function
    public static int countPaths(int i, int j, int m, int n) {
        // Base case: reached destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        // Out of bounds
        if (i >= m || j >= n) {
            return 0;
        }

        // Move right + move down
        return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter grid size (m n):");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = countPaths(0, 0, m, n);
        System.out.println("Total Unique Paths = " + result);
    }
}


// import java.util.Scanner;

// class UniquePath {

//     public static int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];

//         // First row and column = 1
//         for (int i = 0; i < m; i++) {
//             dp[i][0] = 1;
//         }
//         for (int j = 0; j < n; j++) {
//             dp[0][j] = 1;
//         }

//         // Fill DP table
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 dp[i][j] = dp[i-1][j] + dp[i][j-1];
//             }
//         }

//         return dp[m-1][n-1];
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter grid size (m n):");
//         int m = sc.nextInt();
//         int n = sc.nextInt();

//         int result = uniquePaths(m, n);
//         System.out.println("Total Unique Paths = " + result);
//     }
// }
