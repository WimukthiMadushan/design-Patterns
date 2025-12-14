package Factory;

public class PaymentFactory {
    public static Payment getPayment(String method){
        if(method.equalsIgnoreCase("credit")){
            return new CreditCardPayment();
        }
        else if(method.equalsIgnoreCase("debit")){
            return new DebitCardPayment();
        }
        return null;
    }
}
