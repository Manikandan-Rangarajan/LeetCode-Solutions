public class LeetCode2278 {
    public static void main(String[] args) {
        String s = "foobar";
        System.out.println(percentageLetter(s,'o'));
    }
    public static int percentageLetter(String s, char letter) {
        int cnt = 0 ,ans = 0 ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == letter){
                cnt++;
            }
        }
        return (cnt*100)/s.length();
    }
}
