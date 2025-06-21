package forcasting;

public class Forecasting {

    public static double futureValue(double p, double rate, int n) {
        double result = p * Math.pow(1 + rate, n);
        return result;
    }

    public static void main(String[] args) {
        double pv = 10000;
        double growth = 0.1;
        int years = 5;

        double fv = futureValue(pv, growth, years);

        System.out.println("Future value after " + years + " years is: ₹" + String.format("%.2f", fv));
    }
}
