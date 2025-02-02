public class LeetCode1752 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                cnt++;
            }
            if(cnt>1) return false;
        }
        return true;
    }
}
