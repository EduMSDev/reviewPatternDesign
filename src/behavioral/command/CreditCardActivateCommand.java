package behavioral.command;

public class CreditCardActivateCommand implements Command{
	
CreditCard creditCard;
	
	public CreditCardActivateCommand (CreditCard creditcard) {
		this.creditCard = creditcard;
		
	}
	
	@Override
	public void execute() {
		creditCard.sendPinNumberToCustomer();
		creditCard.activate();
	}

}
