public class LeetCode287 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums){
        int n = nums.length;
        boolean[] set = new boolean[n+1];
        for(int i=0;i<nums.length;i++){
            if(set[nums[i]]) return nums[i];
            set[nums[i]] = true;
        }
        return -1;
    }
}
