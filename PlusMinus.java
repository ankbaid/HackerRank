public class PlusMinus {
    private static void plusMinus(int[] arr) {
        int total = arr.length;
        int posSize = 0;
        int negSize = 0;
        int zeroSize = 0;
        for (int i = 0; i < total ; i++) {
            if(arr[i] < 0) negSize++;
            if(arr[i] > 0) posSize++;
            if(arr[i] == 0) zeroSize++;
        }
        System.out.println(String.format("%.6f",(float)posSize/total));
        System.out.println(String.format("%.6f", (float)negSize/total));
        System.out.println(String.format("%.6f", (float)zeroSize/total));
    }

    public static void main(String[] args) {
        plusMinus(new int[]{1,2,-1,-2,0});
    }
}
