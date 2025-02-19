public class LeetCode1622 {
    public static void main(String[] args) {
        String[] w = {"ab","c"};
        String[] s = {"a","bc"};
        System.out.println(arrayStringsAreEqual(w,s));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("",word1);
        String str2 = String.join("",word2);

        return str1.equals(str2);
    }
}
