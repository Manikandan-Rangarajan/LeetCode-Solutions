import java.util.Arrays;

public class LeetCode14 {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] s){
        int len = s.length;
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        String first = s[0],last = s[len-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt((i)));
            }
        }
        return sb.toString();
    }
}
