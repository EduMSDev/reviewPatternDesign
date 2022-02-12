package behavioral.chainofresponsibility;

public class Black implements AproveLoanChain{

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
		if (totalLoan > 10000 && totalLoan <= 50000) {
			System.out.println("Esta solicitud de tarjeta la maneja la tarjeta Platinium.");
		}else {
			next.creditCardRequest(totalLoan);
		}
		
	}

}
