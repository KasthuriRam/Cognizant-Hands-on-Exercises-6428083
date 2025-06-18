public class FinancialForecasting{
    public static double calculateFutureValue(double presentValue, double rate, int years){
        if (years == 0) return presentValue;
        return calculateFutureValue(presentValue, rate, years - 1) * (1 + rate);
    }
    public static double calculateFutureValueIterative(double presentValue, double rate, int years){
        double result=presentValue;
        for (int i=0;i<years;i++){
            result*=(1+rate);
        }
        return result;
    }
    public static void main(String[] args){
        double presentValue=10000;
        double rate=0.07;
        int years=10;
        double recursiveResult=calculateFutureValue(presentValue, rate, years);
        double iterativeResult=calculateFutureValueIterative(presentValue, rate, years);
        System.out.printf("Recursive Forecast after %d years: Rs. %.2f%n", years,recursiveResult);
        System.out.printf("Iterative Forecast after %d years: Rs. %.2f%n", years,iterativeResult);
    }
}
