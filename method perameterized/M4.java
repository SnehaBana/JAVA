public class M4 {

    public static void m1(int a, int b, float f, double d) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
    }

    public static void m2(int b) {
        System.out.println("method 2 is accessed");
        System.out.println(b);
    }

    public static void main(String[] args) {
        m1(20, 9, 99.0f, 4847565.099);
        m2(5);
    }
}
