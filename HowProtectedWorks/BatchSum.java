package HowProtectedWorks;

public class BatchSum {
    protected int sum = 0;

    public BatchSum(final int initialSum) {
        sum = initialSum;
    }

    public BatchSum add(final int delta) {
        sum += delta;
        return this;
    }

    public int get() {
        return sum;
    }
}
