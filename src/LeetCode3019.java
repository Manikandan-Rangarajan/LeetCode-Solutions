public class LeetCode3019 {
    public static void main(String[] args) {
        System.out.println(countKeyChanges("aAbBcC"));
    }
    public static int countKeyChanges(String s) {
        String res = s.toLowerCase();
        int cnt = 0;
        for(int i=0;i<s.length()-1;i++){
            if(res.charAt(i)!=res.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}
