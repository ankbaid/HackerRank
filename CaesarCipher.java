public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(caesarCipher("www.abc.xy", 87));
    }
    static String caesarCipher(String s, int k) {
        String cipherStr = "";
        k = k%26;
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                ascii += k;
                if(ascii > 90){
                    ascii -= 26;
                }
            }else if(ascii >= 97 && ascii <= 122) {
                ascii += k;
                if (ascii > 122) {
                    ascii -= 26;
                }
            }
            cipherStr += String.valueOf((char)ascii);
        }

        return cipherStr;
    }

}
