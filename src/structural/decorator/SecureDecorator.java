package structural.decorator;

public class SecureDecorator extends CreditDecorator{
    public SecureDecorator(Credit decorated) {
        super(decorated);
    }

    @Override
    public void showCredit() {
        super.showCredit();
        this.configureSecure();
    }

    private void configureSecure() {
        System.out.println("Tarjeta configurada");
    }
}
