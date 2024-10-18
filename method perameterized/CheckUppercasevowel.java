
public class CheckUppercasevowel {

    public static void checkuppercasevowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("char is uppercase Vowel");
        } else
            System.out.println("not uppercase vowel");
    }

    public static void main(String[] args) {
        checkuppercasevowel('U');
    }
}
