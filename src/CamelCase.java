public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("helloWorld"));
    }
    static int camelcase(String str) {
        int result = 1;
        if(str.trim().length() == 0) return 0;
        for (int i = 0; i < str.length(); i++) {
            int character = (int)str.charAt(i);
            if(character >= 65 && character <= 90) result++;
        }
        return result;
    }

}
