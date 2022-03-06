package structural.composite;

public class CuentaCorriente implements CuentaComponent{

    private double amount;
    private String name;

    public CuentaCorriente(double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println(this.name);
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
