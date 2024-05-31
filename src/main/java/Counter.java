package src.main.java;

public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 1; // Set initial value to 1 to avoid division by zero
    }

    public void divide(int value) {
        if (value != 0) {
            count /= value;
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public void multiply(int value) {
        count *= value;
    }

    public int getCount() {
        return count;
    }

}
