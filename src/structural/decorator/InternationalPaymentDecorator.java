package structural.decorator;

public class InternationalPaymentDecorator extends CreditDecorator{
    public InternationalPaymentDecorator(Credit decorated) {
        super(decorated);
    }

    @Override
    public void showCredit() {
        super.showCredit();
        this.configInternationalPayment();
    }

    private void configInternationalPayment() {
        System.out.println("Tarjeta configurada");
    }
}
