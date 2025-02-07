import java.util.Arrays;

public class LeetCode1941 {
    public static void main(String[] args) {
        String s = "tveixwaeoezcf";
        System.out.println(areOccurrencesEqual(s));
        System.out.println(optimalSolution(s));
    }
    public static boolean optimalSolution(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int firstNonZeroFreq = 0;
        for (int f : freq) {
            if (f > 0) {
                if (firstNonZeroFreq == 0) {
                    firstNonZeroFreq = f;
                } else if (f != firstNonZeroFreq) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean areOccurrencesEqual(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int cnt=1,m=cnt;
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
                cnt++;
            }else{
                m = Math.max(cnt,m);
                cnt =1;
            }
        }
        m = Math.max(cnt,m);
        return (m == cnt);
    }
}
