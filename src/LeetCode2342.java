// class Solution {
//     public int maximumSum(int[] nums) {
//        int cnt = -1 ,max = cnt;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(sumOfDigits(nums[i]) == sumOfDigits(nums[j])){
//                     cnt = nums[i] + nums[j];
//                     max = Math.max(cnt,max);
//                 }
//             }
//             cnt = -1; 
//         }
//         max = Math.max(cnt,max);
//         return max;
//     }
//     private int sumOfDigits(int n){
//         int temp = n;
//         int sum = 0 ;
//         while(temp>0){
//             int d = temp%10;
//             sum +=d;
//             temp/=10;
//         }
//         return sum;
//     }
// }

import java.util.HashMap;
import java.util.Map;

class LeetCode2342{
    public static void main(String[] args) {
        int[] nums = {18,36,10,19,7,34};
        System.out.println(maximumSum(nums));
    }
    public static int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max= -1;

        for (int num : nums) {
            int digitSum = sumOfDigits(num);

            if (map.containsKey(digitSum)) {
                max = Math.max(max, num + map.get(digitSum));
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }

        return max;
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}