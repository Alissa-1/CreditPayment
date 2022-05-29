public class CreditPaymentService {
    public double calculate(double money, double years, double percent) {
        double months = years * 12;
        double monthPercent = percent / 12 / 100;
        double K = Math.pow(1 + monthPercent, months);
        double annualK = (monthPercent * K / (K - 1));
        double annualPayment = money * annualK;
        return annualPayment;


    }

}

