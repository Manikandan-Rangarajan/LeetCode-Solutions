public class LeetCode3162 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,12};
        int[] arr2 = {2,4};
        System.out.println(numberOfPairs(arr,arr2,2));
    }
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int cnt = 0;
        for(int i=0;i<nums2.length;i++){
            int n = nums2[i]*k;
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]%n==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
