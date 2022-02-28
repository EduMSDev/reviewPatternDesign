package behavioral.templateMethod;

public class Paypal extends Payment{

	@Override
	void init() {
		System.out.println("Inicializando el pago con Paypal");
	}

	@Override
	void startPayment() {
		System.out.println("Realizando el pago con Paypal");
	}

	@Override
	void endPayment() {
		System.out.println("Pago realizado con Paypal");
		
	}
	
	

}
