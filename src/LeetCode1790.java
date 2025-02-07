import java.sql.SQLOutput;

public class LeetCode1790 {
    public static void main(String[] args) {
        String one = "bank";
        String two = "kanb";
        System.out.println(areAlmostEqual(one,two));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int cnt =0;
        char fst1 = '0',fst2 = '0',snd1 = '0',snd2 = '0';
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                cnt++;
                if(cnt == 1){
                    fst1 = s1.charAt(i);
                    fst2 = s2.charAt(i);
                }
                if(cnt == 2){
                    snd1 = s1.charAt(i);
                    snd2 = s2.charAt(i);
                }
            }
            if(cnt>2) return false;
        }

        return (cnt == 0 || cnt == 2 && fst1 == snd2 && snd1 == fst2);
    }
}
