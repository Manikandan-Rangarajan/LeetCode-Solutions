public class LeetCode35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }

    public static int searchInsert(int[] nums, int target){
        int st = 0, end = nums.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else st = mid+1;
        }
        return st;
    }
}
