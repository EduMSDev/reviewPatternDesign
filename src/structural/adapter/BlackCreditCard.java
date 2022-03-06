package structural.adapter;

public class BlackCreditCard implements Secure{
    @Override
    public void payWithMaximizeSecure() {
        System.out.println("Tarjeta Black!");
    }

    @Override
    public void payWithMinimunSecure() {

    }
}
