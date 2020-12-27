import java.util.Arrays;

public class Candles {
    static int birthdayCakeCandles(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int maxHeight = arr[arr.length - 1];
        count++;
        for (int i = arr.length - 2; i >= 0 ; i--) {
            if(arr[i] == maxHeight) count++;
            else break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandlesv2(new int[]{3,2,1,3}));
    }
    private static int birthdayCakeCandlesv2(int[] arr){
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(max == arr[i]){
                count++;
            }else if(max < arr[i]){
                max = arr[i];
                count = 1;
            }
        }
        return count;
    }
}
