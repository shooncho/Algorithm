import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2,3,1,5,6,4};
//        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 2;
//        int k = 4;

        System.out.println(solve(nums,k));
    }

    public static int solve(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length-k];
    }
}
