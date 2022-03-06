package structural.decorator;

public class CreditDecorator implements Credit{
    protected Credit decorated;

    public CreditDecorator(Credit decorated) {
        this.decorated = decorated;
    }

    @Override
    public void showCredit() {
             decorated.showCredit();
    }
}
