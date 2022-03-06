package structural.facade;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La Black tiene un credito de 10000");
    }
}
