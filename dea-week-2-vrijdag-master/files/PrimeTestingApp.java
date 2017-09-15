package ???;

public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 300;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();
    }

    private void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        PrimeTester tester = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);

        tester.startTesting();
    }
}
