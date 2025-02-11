public class LeetCode1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Uo"));
    }
    public static boolean halvesAreAlike(String s) {
        String str1 = s.substring(0,s.length()/2);
        String str2 = s.substring(s.length()/2);
        System.out.println(str2);
        int cnt = 0 ,bnt = 0;
        for(int i=0;i<str1.length();i++){
            if(isVowel(str1.charAt(i))){
                cnt++;
            }
            if(isVowel(str2.charAt(i))){
                bnt++;
            }
        }
        return (cnt == bnt);
    }
    private static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
