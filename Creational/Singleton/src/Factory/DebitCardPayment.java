package Factory;

public class DebitCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment credit card");
    }
}
