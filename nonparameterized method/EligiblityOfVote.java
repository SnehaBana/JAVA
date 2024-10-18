public class EligiblityOfVote {

    public static void eligiblity() {
        int age = 21;
        if (age >= 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible for vote");
        }
    }

    public static void main(String[] args) {
        eligiblity();
    }
}
