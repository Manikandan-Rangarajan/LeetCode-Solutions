public class Leetcode2744 {
    public static void main(String[] args) {
        String[] str = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(str));
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int cnt =0;
        for(int i=0;i<words.length-1;i++){
            String s = new StringBuilder(words[i]).reverse().toString();
            for(int j=i+1;j<words.length;j++){
                if(s.equals(words[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
