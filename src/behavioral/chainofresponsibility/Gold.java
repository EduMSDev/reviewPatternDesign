package behavioral.chainofresponsibility;

public class Gold implements AproveLoanChain{

	private AproveLoanChain next;
	
	@Override
	public void setNext(AproveLoanChain loan) {
		next = loan;
	}

	@Override
	public AproveLoanChain getNext() {
		return next;
	}

	@Override
	public void creditCardRequest(int totalLoan) {
		if (totalLoan <= 10000) {
			System.out.println("Esta solicitud de tarjeta la maneja la tarjeta gold.");
		}else {
			next.creditCardRequest(totalLoan);
		}
		
	}

}
