public class M5 {
    public static void m1(int a, long l, float f, double d, char c, String s) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
    }

    public static void m2(int b) {
        System.out.println("method 2 is accessed");
        System.out.println(b);
    }

    public static void main(String[] args) {
        m1(20, 66844l, 38509f, 3466.54, 'H', "Har");
        m2(5);
    }
}
