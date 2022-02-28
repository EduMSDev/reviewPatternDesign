package behavioral.templateMethod;

public class AppleCard extends Payment{

	@Override
	void init() {
		System.out.println("Inicializando el pago con AppleCard");
	}

	@Override
	void startPayment() {
		System.out.println("Realizando el pago con AppleCard");
	}

	@Override
	void endPayment() {
		System.out.println("Pago realizado con AppleCard");
		
	}
	
	

}
