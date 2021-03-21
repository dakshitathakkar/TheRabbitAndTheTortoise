public class Main {
    public static void main(String[] args) {
        Thread Race;
        Race = Thread.currentThread();
        Race.setName("This is the Race!!");
        System.out.println(Race.getName());

        Rabbit rabbit = new Rabbit();
        rabbit.getThread().start();

        Tortoise tortoise = new Tortoise();
        tortoise.getThread().start();
    }
}
