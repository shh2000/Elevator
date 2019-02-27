public class LiftOff implements Runnable {
    private int cnt;
    private static int taskCount = 0;
    private final int id = taskCount++;
    private int last = 0;
    private int now = 1;

    LiftOff(int cnt) {
        this.cnt = cnt;
    }

    private int status() {
        int tmp = now;
        now += last;
        last = tmp;
        return last;
    }

    public void run() {
        while (cnt-- > 0) {
            System.out.printf("%d(%d) ", status(), id);
            Thread.yield();
        }
    }
}
