package multiplethreadsusingsingleclass;

public class Task extends Thread {
    private final String taskName;
    private final int n;

    public Task(String taskName, int n, String threadName) {
        this.taskName = taskName;
        this.n = n;
        this.setName(threadName);
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for(int i = 1; i <= n; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("An exception occurred at task: " + taskName + ", message: " + e.getMessage());
            }
            String output = taskName + " is running. Status: " + i + "/" + n + ". Running on thread: " + threadName;
            System.out.println(output);
        }
    }
}
