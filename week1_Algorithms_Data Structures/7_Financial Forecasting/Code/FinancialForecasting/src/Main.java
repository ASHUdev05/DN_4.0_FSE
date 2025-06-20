public class Main {
    public static double futureValue(int years, double initialValue, double growthRate) {
        if (years == 0) {
            return initialValue;
        }
        return futureValue(years - 1, initialValue, growthRate) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;
        double growthRate = 0.05;
        int years = 5;

        double result = futureValue(years, initialValue, growthRate);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, result);
    }
}
