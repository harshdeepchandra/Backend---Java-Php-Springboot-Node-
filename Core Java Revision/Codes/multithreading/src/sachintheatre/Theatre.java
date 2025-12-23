package sachintheatre;

public class Theatre implements Runnable {
    private int availableSeats = 1;

    // Method level synchronization
//    @Override
//    public synchronized void run() {
//        String name = Thread.currentThread().getName();
//
//        if(availableSeats > 0) {
//            System.out.println("Congrats, " + name + " you got a seat");
//            availableSeats--;
//        } else {
//            System.out.println("Sorry, " + name + ". Seat not available");
//        }
//    }

    // Block level synchronization
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        synchronized(this) {
            if (availableSeats > 0) {
                System.out.println("Congrats, " + name + " you got a seat");
                availableSeats--;
            } else {
                System.out.println("Sorry, " + name + ". Seat not available");
            }
        }
    }
}
