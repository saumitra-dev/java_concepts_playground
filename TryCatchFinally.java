import java.util.Random;

public class TryCatchFinally {
    private static int demonstrateHowFinallyWorks() {
        try {
            System.out.println("Entered `try` block.");

            final Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            if (random.nextBoolean())
                return 10;
            else
                throw new Exception("Bad luck");
        } catch (final Exception e) {
            System.out.println("Entered `catch` block.");
            System.out.println(e.getMessage());

            return 20;
        } finally {
            System.out.println("Entered `finally` block.");
        }
    }

    public static void main(String[] args) {
        System.out.println(demonstrateHowFinallyWorks());
    }
}
