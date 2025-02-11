public class LeetCode1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(4));
    }
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0){
            while(n>1){
                sb.append("a");
                n--;
            }
            sb.append("b");
        }else{
            sb.repeat("a",n);
        }
        return sb.toString();
    }
}
