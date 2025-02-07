public class LeetCode541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseStr(s,2));

    }
    public static String reverseStr(String s, int k) {
        String s1 = s.substring(0,k);
        String s2 = s.substring(k);
        String rev = new StringBuilder(s1).reverse().toString();
        return rev+s2;
    }
}
