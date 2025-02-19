public class LeetCode3427 {
    public static void main(String[] args) {
        int[] arr = {2,3,1};
        System.out.println(subarraySum(arr));
    }
    public static int subarraySum(int[] nums) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                cnt+=nums[j];
            }
        }
        return cnt;
    }
}
