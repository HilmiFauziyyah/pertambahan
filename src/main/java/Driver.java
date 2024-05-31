import src.main.java.Counter;

public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println("Count: " + counter.getCount());

        counter.multiply(5);  // Multiply by 5
        System.out.println("Count after multiplying by 5: " + counter.getCount());

        counter.divide(2);  // Divide by 2
        System.out.println("Count after dividing by 2: " + counter.getCount());

        counter.divide(0);  // Attempt to divide by 0
        System.out.println("Count after attempting to divide by 0: " + counter.getCount());

        counter.reset();
        System.out.println("Count after reset: " + counter.getCount());

    }

}
