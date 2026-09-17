
import java.util.*;

class FourSumBrute {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int d = k + 1; d < n; d++) {
                        if (nums[i] + nums[j] + nums[k] + nums[d] == target) {
                            List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], nums[d]);
                            Collections.sort(quad);
                            if (!ans.contains(quad)) {
                                ans.add(quad);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        List<List<Integer>> result = fourSum(nums, target);
        System.out.println("Quadruplets: " + result);
    }
}



//  import java.util.*;
// class FourSum{

//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length;

//         for (int i = 0; i < n - 3; i++) {
//             if (i > 0 && nums[i] == nums[i-1]) continue; // skip duplicate i

//             for (int j = i + 1; j < n - 2; j++) {
//                 if (j > i + 1 && nums[j] == nums[j-1]) continue; // skip duplicate j

//                 int left = j + 1;
//                 int right = n - 1;

//                 while (left < right) {
//                     long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

//                     if (sum == target) {
//                         ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

//                         // skip duplicates for left and right
//                         while (left < right && nums[left] == nums[left+1]) left++;
//                         while (left < right && nums[right] == nums[right-1]) right--;

//                         left++;
//                         right--;
//                     } else if (sum < target) {
//                         left++;
//                     } else {
//                         right--;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }



