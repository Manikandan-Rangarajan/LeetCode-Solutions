import java.util.Arrays;

public class LeetCode2657 {
    public static void main(String[] args) {
        int[] a = {1,3,2,4};
        int[] b = {3,1,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a,b)));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            int[] result = new int[n];
            boolean[] seenA = new boolean[n + 1];
            boolean[] seenB = new boolean[n + 1];
            int commonCount = 0;

            for (int i = 0; i < n; i++) {
                // Mark the current number in A as seen
                if (seenB[A[i]]) {
                    commonCount++; // Already seen in B
                }
                seenA[A[i]] = true;

                // Mark the current number in B as seen
                if (seenA[B[i]]) {
                    commonCount++; // Already seen in A
                }
                seenB[B[i]] = true;

                result[i] = commonCount;
            }
            return result;
    }

}
