package structural.facade;

public class Silver implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La Silver tiene un credito de 2000");
    }
}
