public class Method1 {

    public static void m1(int a) {
        System.out.println("method 1 is accessed");
        System.out.println(a);
    }

    public static void m2(int b) {
        System.out.println("method 2 is accessed");
        System.out.println(b);
    }

    public static void main(String[] args) {
        m1(7);
        m2(5);
    }
}
