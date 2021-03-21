public class Rabbit implements Runnable {

    private final Thread thread;

    public Rabbit() {
        this.thread = new Thread(this,"rabbit");
    }

    public Thread getThread() {
        return thread;
    }

    private static final int MILESTONES = 5;

    @Override
    public void run() {
        for (int i = 0; i < MILESTONES; i++) {
            switch (i) {
                case 0 -> System.out.println("The Rabbit has started the race!!");
                case 1 -> System.out.println("The Rabbit has reached The Cool River.");
                case 2 -> System.out.println("The Rabbit has reached The Mountain Hill.");
                case 3 -> {
                    System.out.println("The Rabbit has reached The Big Oak Tree.");
                    System.out.println("The Rabbit is now going to sleep for a while.");
                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException e) {
                        System.err.println("Rabbit's sleep has been interrupted.");
                    }
                }
                case 4 -> System.out.println("The Rabbit has finished the race!!");
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost its path.");
            }

        }


    }
}
