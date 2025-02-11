public class LeetCode1812 {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
    }
    public static boolean squareIsWhite(String s) {
        if(s.charAt(0)%2==0 && s.charAt(1)%2!=0){
            return true;
        }
        if(s.charAt(0)%2!=0 && s.charAt(1)%2==0){
            return true;
        }

        return false;
    }
}
