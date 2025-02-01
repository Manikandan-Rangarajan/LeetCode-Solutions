public class LeetCode7 {
    public static void main(String[] args) {
        int x = -123 ;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int temp = Math.abs(x) ;long rev=0;
        while(temp!=0){
            int d = temp%10;
            temp = temp/10;
            rev = (rev*10)+d;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        if(x<0){
            return (int)(-1*rev);
        }else{
            return (int)rev;
        }
    }
}
