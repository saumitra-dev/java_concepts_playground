import HowProtectedWorks.BatchSum;

public class ProtectedTest {
    static class BatchSumWithMultiplication extends BatchSum {
        protected boolean hasMultipliedAtleastOnce = false;

        public BatchSumWithMultiplication(int initialSum) {
            super(initialSum);
        }

        public BatchSumWithMultiplication mul(final int factor) {
            hasMultipliedAtleastOnce = true;

            sum *= factor;
            return this;
        }

        @Override
        public BatchSumWithMultiplication add(int delta) {
            super.add(delta);
            return this;
        }
    }

    public static void main(String[] args) {
        final BatchSumWithMultiplication batchSumAndMul = new BatchSumWithMultiplication(0);
        System.out.println(batchSumAndMul.add(10).add(-1).mul(10).get());

        // Doesn't work
        // System.out.println(batchSumAndMul.sum);

        // Does work
        System.out.println(batchSumAndMul.hasMultipliedAtleastOnce);
    }
}
