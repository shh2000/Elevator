package count.lift;

public class LiftOff implements Runnable {
    private int countDown;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    private String status() {
        String result = "#" + id + "(";
        if (countDown > 0) {
            result += countDown;
        } else {
            result += "LiftOff!";
        }
        result += "), ";
        return result;
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
