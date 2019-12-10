import java.util.HashSet;
import java.util.Set;

public class TwoCharacters {
    static int alternate(String str) {
        Set<Character> uniqurCharacters = new HashSet<>(4);
        for (int i = 0; i < str.length(); i++) {
            char c= str.charAt(i);
            uniqurCharacters.add(c);
        }
        uniqurCharacters.stream().forEach(c -> {
            System.out.println(c.hashCode());
        });
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(alternate("ffffffaabbccddeeee"));
    }
}
