public class LeetCode1844 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }

    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append((char) (s.charAt(i-1) + (s.charAt(i))-'0'));
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
