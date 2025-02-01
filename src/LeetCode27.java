public class LeetCode27 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2};
        int ans = removeElement(nums,3);
        for(int i=0;i<ans;i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static int removeElement(int[] nums, int val){
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ans]=nums[i];
                ans++;
            }
        }

        return ans;
    }
}
