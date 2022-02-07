package creational.factorymethod;

public class PaymentFactory {
	public static Payment buildPayment(TypePayment typePayment) {
		switch (typePayment) {
		case GOOGLEPLAY:
			return new GooglePayment();
		case CARD:
			return new CardPayment();
		default:
			return new CardPayment();
		}
	}

}
