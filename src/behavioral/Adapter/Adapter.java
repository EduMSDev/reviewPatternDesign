package behavioral.Adapter;

public class Adapter implements Payment {


    Secure secure;

    public Adapter(String type) {
        if (type.equals("black")) {
            this.secure = new BlackCreditCard();
        } else if (type.equals("gold")) {
            this.secure = new GoldCreditCard();
        }

    }

    @Override
    public void pay(String type) {
        if (type.equals("black")) {
            secure.payWithMaximizeSecure();
        } else if (type.equals("gold")) {
            secure.payWithMinimunSecure();
        }
    }
}
