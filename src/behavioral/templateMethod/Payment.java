package behavioral.templateMethod;

public abstract class Payment {
	
	abstract void init();
	abstract void startPayment();
	abstract void endPayment();
	
	 public final void makePayment() {
		 init();
		 startPayment();
		 endPayment();
	 }

}
