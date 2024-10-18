public class Method3 {

    public static void m1(boolean b, double d, float f) {
        System.out.println("method 1 is accessed");
        System.out.println(b + "" + d + "" + f + "");
    }

    public static void m2(int b) {
        System.out.println("method 2 is accessed");
        System.out.println(b);
    }

    public static void main(String[] args) {
        m1(true, 5674.89, 67.0f);
        m2(5);
    }
}
