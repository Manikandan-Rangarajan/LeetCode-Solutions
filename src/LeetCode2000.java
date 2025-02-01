import java.util.Arrays;

public class LeetCode2000 {
    public static void main(String[] args) {
        String a = "abcdefg";
        char target = 'd';
        char[] str = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            if (c == target) {
                sb.append(c);
                break;
            }
            sb.append(c);
        }
        String result = sb.reverse().toString();
        System.out.println(Arrays.toString(str)+" " + result);
        int index = a.indexOf(target);
        String part2 = a.substring(index+1);
        String res = result+part2;
        System.out.println(res);
    }
}
