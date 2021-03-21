public class Tortoise extends Thread {

    private final Thread thread;


    public Tortoise() {
        thread = new Thread(this,"Tortoise");
    }

    public Thread getThread() {
        return thread;
    }

    private static final int MILESTONES = 5;

    @Override
    public void run() {
        for (int i = 0; i < MILESTONES; i++) {
            switch (i) {
                case 0 -> System.out.println("The Tortoise has started the race!!");
                case 1 -> System.out.println("The Tortoise has reached The Cool River.");
                case 2 -> System.out.println("The Tortoise has reached The Mountain Hill.");
                case 3 -> System.out.println("The Tortoise has reached The Big Oak Tree.");
                case 4 -> System.out.println("The Tortoise has finished the race!!");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise has lost its path.");
            }

        }

    }

}
