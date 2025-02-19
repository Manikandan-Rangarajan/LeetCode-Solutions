public class LeetCode1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("this is a man of steel",4));
    }
    public static String truncateSentence(String s, int k) {
        int cnt =0;
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
    //public String truncateSentence(String s, int k) {
//         int cnt =0;
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 cnt++;
//             }
//             if(cnt<k){
//                 sb.append(s.charAt(i));
//             }else{
//                 break;
//             }
//         }
//         return sb.toString();
//     }
}
