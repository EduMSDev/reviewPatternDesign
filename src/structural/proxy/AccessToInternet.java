package structural.proxy;

public class AccessToInternet implements Internet {


    @Override
    public void connecTo(String url) throws Exception {
        System.out.println("Conectando a " + url);
    }
}
