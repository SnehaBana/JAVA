public class UrName {

    public static void urnameandage(String name, int age) {
        int count = 0;
        for (int i = 1; i <= age; i++) {

            System.out.println(name);
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        urnameandage("mayank", 22);

    }

}
