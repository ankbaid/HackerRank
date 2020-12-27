import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("abcdefghijklmnopqrstuvwxyz"));
    }
    static String pangrams(String str) {
        String result = "pangram";
        Set<Integer> uniqueAlphabets = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.toLowerCase().charAt(i);
            int charAscii = (int)alphabet;
            if(charAscii >= 96 && charAscii <= 122) {
                uniqueAlphabets.add(charAscii);
            }
        }
        if(uniqueAlphabets.size() != 26) return "not pangram";
        return result;
    }
}
