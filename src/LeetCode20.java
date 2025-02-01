import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        String s = "()[{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stk = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '('|| ch == '{' || ch == '['){
                stk.push(ch);
            }else{
                if(stk.isEmpty()||(ch==')' && stk.pop()!='(')||(ch=='}' && stk.pop()!='{')||(ch==']' && stk.pop()!='[')){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
