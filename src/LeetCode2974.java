import java.util.Arrays;

public class LeetCode2974 {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}
