public class Method2 {

    public static void m1(int i, float a) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
    }

    public static void m2(int j, float b) {
        System.out.println("method 2 is accessed");
        System.out.println(b);
    }

    public static void main(String[] args) {
        m1(9, 20.0f);
        m2(20, 9.0f);
    }
}
