import java.util.Stack;

public class LeetCode1598 {
    public static void main(String[] args) {
        String[] arr = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(arr));
    }
    public static int minOperations(String[] logs) {
        Stack<String> stk = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")) continue;
            if(logs[i].equals("../") && !stk.isEmpty())stk.pop();
            else stk.push(logs[i]);
        }
        return stk.size();
    }
}
