import java.util.Stack;

public class LeetCode3174 {
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();
        int cnt =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                stk.push(s.charAt(i));
            } else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                stk.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        String ans = sb.reverse().toString();
        return ans;
    }
}
