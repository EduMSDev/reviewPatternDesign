package creational.factorymethod;

public class GooglePayment implements Payment{

	@Override
	public void doPayment() {
		System.out.println("Haciendo el pago con google play");
	}

}
