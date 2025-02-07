public class LeetCode2287 {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        System.out.println(rearrangeCharacters(s,target));
    }
    public static int rearrangeCharacters(String s, String target) {
        int[] arr = new int[26], arr2 = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            arr2[ch-'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(char ch: target.toCharArray()){
            min = Math.min(min,arr[ch-'a']/arr2[ch-'a']);
        }
        return min;
    }
}
