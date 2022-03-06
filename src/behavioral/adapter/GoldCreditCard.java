package behavioral.adapter;

public class GoldCreditCard  implements Secure{
    @Override
    public void payWithMaximizeSecure() {
        //ni implementar
    }

    @Override
    public void payWithMinimunSecure() {
        System.out.println("Tarjeta gold!");
    }
}
