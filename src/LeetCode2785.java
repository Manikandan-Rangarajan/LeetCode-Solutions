import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode2785 {
    public static void main(String[] args) {
        System.out.println(sortVowels("LEetCode"));
    }
    public static String sortVowels(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();

        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' ) {
                ch.add(s.charAt(i));
                arr.add(i);
            }
        }
        char[] arr2 = new char[ch.size()];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = ch.get(i);
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            sb.setCharAt(arr.get(i),arr2[i]);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
