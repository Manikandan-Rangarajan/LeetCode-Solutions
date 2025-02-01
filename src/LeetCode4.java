import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int[] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        int n = nums1.length;
        for(int i=0;i<n;i++){
            arr.add(nums1[i]);
        }
        n = nums2.length;
        for(int i=0;i<n;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        n = arr.size();
        if(n%2!=0){
            return (double)arr.get((n/2));
        }else{
            return (double)((arr.get(n/2))+(arr.get((n/2)-1)))/2;
        }
    }
}
