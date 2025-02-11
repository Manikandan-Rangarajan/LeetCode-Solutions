public class LeetCode3168 {
    public static void main(String[] args) {
        System.out.println(minimumChairs("ELEELEELLL"));
    }
    public static int minimumChairs(String s) {
        int cnt = 0, max = cnt;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                cnt++;
                max = Math.max(cnt,max);
            }else{
                cnt--;
            }
        }
        max = Math.max(cnt,max);
        return max;
    }
}
