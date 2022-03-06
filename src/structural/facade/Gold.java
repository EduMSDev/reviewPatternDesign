package structural.facade;

public class Gold implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La gold tiene un credito de 5000");
    }
}
