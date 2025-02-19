import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1313 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                lst.add(nums[i+1]);
            }
        }
        int[] ans = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}
