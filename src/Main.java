public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 1, 9.99);
        payment = Math.round(payment);
        System.out.println("Ежемесячный платёж составит " + payment + " рублей.");

    }
}
