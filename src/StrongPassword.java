public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(4, "4700"));
    }
    static int minimumNumber(int n, String password) {
        int result = 0;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean number = false;
        boolean special = false;

        for (int i = 0; i < n; i++) {
            char alphabet = password.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z') lowerCase = true;
            if(alphabet >= 'A' && alphabet <= 'Z') upperCase = true;
            if(alphabet >= '0' && alphabet <= '9') number = true;
            if("\"!@#$%^&*()-\"+".indexOf(alphabet) != -1) special = true;
        }
        if(!lowerCase) result++;
        if(!upperCase) result++;
        if(!number) result++;
        if(!special) result++;
        //if(n >= 6) return result;
        if(n + result >= 6) return result;
        else return 6 - n;

    }
}
