import java.util.Arrays;

public class LeetCode3194 {
    public static void main(String[] args) {
        int[] nums = {4,7,5,5};
        System.out.println(minimumAverage(nums));
    }
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        double ans = Double.MAX_VALUE;
        while(i<j){
            double max = (double)(nums[i] + nums[j])/2;
            ans = Math.min(max,ans);
            i++;j--;
        }
        return ans;
    }
}
