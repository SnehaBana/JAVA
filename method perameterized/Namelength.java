public class Namelength {

    public static void m1(String s1, String s2) {

        int a = s1.length();
        int b = s2.length();
        if (a > b) {
            int sqr = a * a;
            System.out.println(sqr);
        }

        else if (b > a) {
            int cube = b * b * b;
            System.out.println(cube);

        } else
            System.out.println("same");

    }

    public static void main(String[] args) {
        m1("dipanshu", "jhare");
    }
}
