import Builder.Computer;
import Factory.Payment;
import Factory.PaymentFactory;
import SIngelton.Singelton;

public class Main {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();

        Computer pc = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("1TB SSD")
                .build();

        Payment payment = PaymentFactory.getPayment("credit");
        payment.pay();
    }
}