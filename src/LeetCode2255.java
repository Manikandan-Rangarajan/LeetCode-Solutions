public class LeetCode2255 {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        System.out.println(countPrefixes(words,s));
        System.out.println(optimalSolution(words,s));
    }
    public static int countPrefixes(String[] words, String s) {
        int cnt =0;
        for(int i=0;i<words.length;i++){
            boolean flag = true;
            if(words[i].length()>s.length()) {
                flag=false;
            }
            else{
                for(int j=0;j<words[i].length();j++){
                    if(s.charAt(j)!=words[i].charAt(j)) flag = false;
                }}
            if(flag) cnt++;
        }
        return cnt;
    }
    public static int optimalSolution(String[] words, String s) {
        int ans = 0;

        for (String word : words) {
            if (s.startsWith(word)) {
                ans++;
            }
        }

        return ans;
    }
}
