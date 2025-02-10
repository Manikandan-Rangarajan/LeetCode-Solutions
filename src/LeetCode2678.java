public class LeetCode2678 {
    public static void main(String[] args) {
        String[] s = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(s));
    }
    public static int countSeniors(String[] details) {
        int ans = 0;
        for(String word:details){
            int n = Integer.parseInt(word.substring(11,14));
            if(n>60){
                ans++;
            }
        }
        return ans;
    }
}
