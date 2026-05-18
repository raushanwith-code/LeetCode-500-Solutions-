import java.util.*;

public class MajorityElementTwo {

    
    public ArrayList<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            
            for (int j = 0; j < n; j++) {


                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            
            if (count > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        MajorityElementTwo ans = new MajorityElementTwo();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int n = sc.nextInt();

        int nums[] = new int[n];


        System.out.println("Enter Array Elements:");
        
        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();
        }

        System.out.println("Final output is:");

        System.out.println(ans.majorityElement(nums));

        sc.close();
    }
}
