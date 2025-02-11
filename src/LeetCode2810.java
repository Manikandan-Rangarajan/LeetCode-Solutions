public class LeetCode2810 {
    public static void main(String[] args) {
        System.out.println(finalString("String"));
    }
    public static String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
