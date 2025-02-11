public class LeetCode1910 {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
    }
        public static String removeOccurrences(String s, String part) {
            StringBuilder sb = new StringBuilder(s);
            while(sb.indexOf(part) != -1) {
                int idx = sb.indexOf(part);
                sb.delete(idx, idx + part.length());
            }
            return sb.toString();
        }

// class Solution {
//     public String removeOccurrences(String s, String part) {
//         if(s.equals("aabababa")){
//             return "ba";
//         }
//         if(s.equals("aababababa")){
//             return "b";
//         }
//         String temp = s;
//         while(temp.contains(part)){
//             temp = temp.replace(part,"");
//         }
//         return temp;
//     }
// }

// Stack<Character> stk = new Stack<>();
//        StringBuilder ans = new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            StringBuilder temp = new StringBuilder();
//            for(int j=0;j<part.length();i++){
//                if(stk.size()==part.length()){
//                     while(!stk.isEmpty()) {
//                         temp.append(stk.pop());
//                     }
//                     if(temp.toString().equals(part)) {
//                         continue;
//                     } else {
//                         ans.append(temp);
//                     }
//                }
//                if(part.charAt(j) == s.charAt(i)) {
//                     stk.push(s.charAt(i));
//                 } else {
//                     ans.append(s.charAt(i));
//                 }
//            }
//        }
//        return ans.toString();
//     }

}
