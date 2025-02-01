public class LeetCode9 {
    public static void main(String[] args) {
        int x = 99;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
       int temp = x, rev = 0 ;
       while(temp>0){
           int d = temp%10;
           rev = (rev * 10)+d;
           temp /= 10;
       }
       if(rev == x) return true;
       return false;
    }
}
