//public class LeetCode2698 {
//    public static void main(String[] args) {
//        System.out.println(punishmentNumber(37));
//    }
//
//    public static int punishmentNumber(int n) {
//        int cnt = 0;
//        for(int i = 1; i <= n; i++) {
//            int square = i * i;
//            if(getDigitalRoot(square) == getDigitalRoot(i)) {
//                cnt += square;
//            }
//        }
//        return cnt;
//    }
//
//    private static int getDigitalRoot(int n) {
//        if (n < 10) {
//            return n;
//        }
//        int sum = 0;
//        while(n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return getDigitalRoot(sum);
//    }
//}
public class LeetCode2698 {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(36));
    }

    public static int punishmentNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (canPartition(String.valueOf(i * i), 0, i)) {
                result += i * i;
            }
        }
        return result;
    }

    private static boolean canPartition(String square, int index, int target) {
        if (index == square.length()) {
            return target == 0;
        }

        for (int i = index; i < square.length(); i++) {
            // Skip leading zeros unless it's a single '0'
            if (square.charAt(index) == '0' && i > index) {
                break;
            }

            String substring = square.substring(index, i + 1);
            int value = Integer.parseInt(substring);

            if (value > target) {
                break;  // No need to continue as value will only get larger
            }

            if (canPartition(square, i + 1, target - value)) {
                return true;
            }
        }

        return false;
    }
}