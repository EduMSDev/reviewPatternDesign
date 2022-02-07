import creational.factorymethod.Payment;
import creational.factorymethod.PaymentFactory;
import creational.factorymethod.TypePayment;

public class Main {
	public static void main(String[] args) {
		testingAsbtractFactoryMethod();
	}
	
	
	private static void testingAsbtractFactoryMethod() {
		Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
		payment.doPayment();
	}
}
