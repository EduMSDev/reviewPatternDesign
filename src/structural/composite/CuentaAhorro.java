package structural.composite;

public class CuentaAhorro implements CuentaComponent{

    private double amount;
    private String name;

    public CuentaAhorro(double amount, String name) {
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
