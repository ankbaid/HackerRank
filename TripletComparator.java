import java.util.Arrays;
import java.util.List;

public class TripletComparator {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aWins = 0;
        int bWins = 0;
        for (int i = 0; i < a.size(); i++) {
            int aValue = a.get(i);
            int bValue = b.get(i);
            int compare = Integer.compare(aValue, bValue);
            if(compare > 0) aWins++;
            if(compare < 0) bWins++;
        }
        return Arrays.asList(aWins, bWins);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
        System.out.println(compareTriplets(a, b));
    }
}
