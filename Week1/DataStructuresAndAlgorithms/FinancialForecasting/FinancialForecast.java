
public class FinancialForecast {

    public static double futureValue(double pv, double r, int n) {
        if (n == 0) {
            return pv;
        }
        return (1 + r) * futureValue(pv, r, n - 1);
    }

    public static void main(String[] args) {
        double initialAmount = 100000;
        double annualGrowth = 0.07;  
        int years = 10;

        double Value = futureValue(initialAmount, annualGrowth, years);

        System.out.printf("\n -> Future value after %d years: %.2f%n \n", years, Value);
    }
}
