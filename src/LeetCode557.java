public class LeetCode557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for(int i=0;i<str.length;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(str[i]);
            res[i] = sb.reverse().toString();
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<res.length;i++){
            ans.append(res[i]).append(" ");
        }
        return ans.toString().trim();
    }
}
