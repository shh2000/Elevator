public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff(i + 5)).start();
        }
        System.out.println("Waiting for display");
    }
}
