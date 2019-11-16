import static java.lang.System.out;

public class MarsExploration {
    public static void main(String[] args) {
        out.println(marsExploration("SOSSPSSQSSOR"));
    }
    static int marsExploration(String s) {
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            if((i % 3 == 0) || (i % 3 == 2)){
                if(s.charAt(i) != 'S'){
                    result++;
                }
            }
            if(i % 3 == 1){
                if(s.charAt(i) != 'O'){
                    result++;
                }
            }
        }
        return result;
    }
}
