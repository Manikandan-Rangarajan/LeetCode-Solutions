import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            // Print spaces
//            for (int j = rows - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            // Print stars
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
        String ss = "43";
//        BigInteger n = new BigInteger(s);
//        System.out.println(n.multiply(3));
        String sss = "ab3";
        System.out.println(Character.isAlphabetic(ss.charAt(0)));
        String[] strs = {"alic3","bob","3","4","00000"};
        int max=0;
        for(String s:strs){
            boolean flag = true;
            for(char c :s.toCharArray()){
                if(Character.isAlphabetic(c)) flag = true;
                else flag = false;break;
            }
            if(flag){
                max = Math.max(max,s.length());
            }else{
                max = Math.max(max,Integer.parseInt(s));
            }
        }
        System.out.println(max);
    }
}