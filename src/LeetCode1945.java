public class LeetCode1945 {
    public static void main(String[] args) {
        String s = "iiii";
        System.out.println(getLucky(s,1));
        s = "leetcode";
        System.out.println(getLucky(s,2));
    }
    public static int getLucky(String s, int k) {
        long sum = 0;
        for(char c : s.toCharArray()){
            int num = c - 'a' + 1;
            if(num >= 10) {
                sum += (num / 10) + (num % 10);
            } else {
                sum += num;
            }
        }
        
        for(int i = 1; i < k; i++){
            sum = getDigitSum(sum);
        }

        return (int)sum;
    }

    private static long getDigitSum(long num) {
        long sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}