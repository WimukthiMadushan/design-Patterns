package Factory;

public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment credit card");
    }
}
