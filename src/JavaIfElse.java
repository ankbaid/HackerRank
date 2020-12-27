package src;

import java.util.*;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if(num%2 != 0) {
            System.out.println("Weird");
            return;
        }
        if(num >= 2 && num <= 5){
            System.out.println("Not Weird");
            return;
        }
        if(num%2 == 0 && (num >= 6 && num <= 20)){
             System.out.println("Weird");
             return;
        }
        if(num%2 == 0 && (num > 20)) {
            System.out.println(" Not Weird");
            return;
        }
    }
}
