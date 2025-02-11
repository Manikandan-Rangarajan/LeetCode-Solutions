public class LeetCode1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] str2 = new String[str.length];
        for(int i=0;i<str.length;i++){
            int num = str[i].charAt(str[i].length()-1)-'0';
            str2[num-1] = str[i].substring(0,str[i].length()-1);
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str2.length;i++){
            res.append(str2[i]).append(" ");
        }

        return res.toString().trim();
    }
}
