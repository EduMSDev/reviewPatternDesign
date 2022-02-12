package behavioral.command;

public class CreditCardDesactivateCommand implements Command {
	
	CreditCard creditCard;
	
	public CreditCardDesactivateCommand (CreditCard creditcard) {
		this.creditCard = creditcard;
		
	}

	@Override
	public void execute() {
		creditCard.desactivate();
		creditCard.sendPinNumberToCustomerDesactivate();
		
	}

}
