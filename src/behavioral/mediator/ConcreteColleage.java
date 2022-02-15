package behavioral.mediator;

public class ConcreteColleage extends Colleage{

	
	
	public ConcreteColleage(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Colleage ha recibido el siguiente mensaje del chat: ");
	}
	

}
