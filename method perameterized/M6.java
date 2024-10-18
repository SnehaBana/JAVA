public class M6 {
    public static void m1(int a) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
    }

    public static void m2(boolean b, double d, float f) {
        System.out.println("method 1 is accessed");
        System.out.println(b + "" + d + "" + f + "");
    }

    public static void m3(int i, float a) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
    }

    public static void m4(int a, int b, float f, double d) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
    }

    public static void main(String[] args) {
        m1(9);
        m3(20, 9.0f);
        m2(true, 5674.89, 67.0f);
        m4(20, 9, 99.0f, 4847565.099);
        m5(20, 66844l, 38509f, 3466.54, 'H', "Har");
    }

    public static void m5(int a, long l, float f, double d, char c, String s) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
    }

}
