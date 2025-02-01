import java.util.Stack;

public class LeetCode32 {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(partialsolution(s));
        System.out.println(longestValidParentheses(s));
    }
    public static int partialsolution(String s){
        int ans =0;
        Stack<Character> stk = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '('){
                stk.push(ch);
            }
            else if(!stk.isEmpty() && (stk.peek()=='(' && ch==')')){
                stk.pop();
                ans += 2 ;
            }
        }
        return ans;
    }
    public static int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int maxLen = 0;
        stk.push(-1); // Base index for valid substrings

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stk.push(i); // Push the index of '('
            } else {
                stk.pop(); // Pop the last '(' or base index

                if (stk.isEmpty()) {
                    stk.push(i); // Update the base index if stack is empty
                } else {
                    maxLen = Math.max(maxLen, i - stk.peek()); // Calculate valid length
                }
            }
        }

        return maxLen;
    }
}
