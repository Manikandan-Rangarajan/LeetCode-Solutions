import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2161 {
    public static void main(String[] args) {
        int[]  nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums,10)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                lst.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                lst.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                lst.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = lst.get(i);
        }
        return nums;
    }
}
