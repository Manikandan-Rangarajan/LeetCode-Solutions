public class LeetCode1446 {
    public static void main(String[] args) {
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }
    public static int maxPower(String s) {
        int cnt = 1, max = cnt;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                max = Math.max(cnt,max);
                cnt = 1;
                continue;
            }
            cnt++;
        }
        max = Math.max(cnt,max);
        return max;
    }
}
