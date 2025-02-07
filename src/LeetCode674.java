public class LeetCode674 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
        public static int findLengthOfLCIS(int[] nums) {
            int cnt = 1, max = cnt;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    cnt++;
                }else{
                    max = Math.max(cnt,max);
                    cnt = 1;
                }
            }
            return Math.max(cnt,max);
        }
}
