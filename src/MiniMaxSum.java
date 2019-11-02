import java.util.Arrays;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        long minSum = 0;
        long maxSum = 0;
        long sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        minSum = sum - arr[arr.length - 1];
        maxSum = sum - arr[0];

        System.out.println(minSum + "  " + maxSum);
    }
    public static void main(String[] args) {
        miniMaxSum(new int[]{1, 2, 3, 4, 5});
    }
}
