public class CharUppercaseORNot {
    public static void checkuppercase() {
        char ch = 'H';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("char is uppercase");
        } else
            System.out.println("char is lowercase");

    }

    public static void main(String[] args) {
        checkuppercase();
    }
}
