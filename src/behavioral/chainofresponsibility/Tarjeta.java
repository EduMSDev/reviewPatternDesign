package behavioral.chainofresponsibility;

public class Tarjeta implements AproveLoanChain {
	
	private AproveLoanChain next;

	@Override
	public void setNext(AproveLoanChain loand) {
		next = loand;
		
	}

	@Override
	public AproveLoanChain getNext() {
		return next;
	}

	@Override
	public void creditCardRequest(int totalLoan) {
		Gold gold= new Gold();
		this.setNext(gold);
		Platinium platiun = new Platinium();
		gold.setNext(platiun);
		Black black = new Black();
		black.setNext(platiun);
		
		
	}

}
