package behavioral.command;

public class CreditCard {
	
	public void sendPinNumberToCustomer() {
		System.out.println("El pin number ha sido enviado al cliente");
	}

	public void sendSMSToCustomerActivate() {
		System.out.println("Enviado SMS");
	}
	
	public void activate() {
		System.out.println("El pin number ha sido activado");
	}
	
	public void desactivate() {
		System.out.println("El pin number ha sido desactivado");
	}
	
	public void sendPinNumberToCustomerDesactivate() {
		System.out.println("Enviado SMS al cliente sobre la desactivacion");
	}
	
}
