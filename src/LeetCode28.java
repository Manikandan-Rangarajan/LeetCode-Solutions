public class LeetCode28 {
    public static void main(String[] args) {
        String str = "opiuLeetcode";
        String needle = "Leet";
        System.out.println(sol1(str,needle));
        System.out.println(sol2(str,needle));
    }
    public static int sol1(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static int sol2(String haystack, String needle){
        for(int i=0,j=needle.length();j<haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
