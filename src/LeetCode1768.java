public class LeetCode1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Math.min(word1.length(),word2.length());i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        String bal = "";
        if(word1.length()>word2.length()){
            int num = Math.min(word1.length(),word2.length());
            bal = word1.substring(num);
        }else{
            int num = Math.min(word1.length(),word2.length());
            bal = word2.substring(num);
        }
        sb.append(bal);
        return sb.toString();
    }
}
