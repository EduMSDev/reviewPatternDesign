package structural.bridge;

public class SecureCreditCard implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Con seguridad");
    }
}
