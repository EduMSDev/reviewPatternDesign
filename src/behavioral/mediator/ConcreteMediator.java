package behavioral.mediator;

public class ConcreteMediator implements Mediator{
	
	private ConcreteColleage colleage1;
	private ConcreteColleage2 colleage2;

	@Override
	public void send(String message, Colleage colleage) {
		if(colleage ==colleage1) {
			colleage2.messageReceived(message);
		}else if (colleage ==colleage2){
			colleage1.messageReceived(message);
		}
		
	}
	
	public void setUser1(ConcreteColleage colleage) {
		colleage1=colleage;
	}
	
	public void setUser2(ConcreteColleage2 colleage) {
		colleage2=colleage;
	}
	

}
