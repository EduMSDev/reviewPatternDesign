package behavioral.chainofresponsibility;

public interface AproveLoanChain {
	
	void setNext(AproveLoanChain loand);
	AproveLoanChain getNext();
	void creditCardRequest(int totalLoan);

}
