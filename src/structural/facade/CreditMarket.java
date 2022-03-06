package structural.facade;

public class CreditMarket {

    private Credit gold;
    private Credit black;
    private Credit Silver;

    public CreditMarket() {
        gold = new Gold();
        black = new Black();
        Silver = new Silver();
    }

    public void showCreditGold() {
        gold.showCredit();
    }
    public void showCreditBlack() {
        black.showCredit();
    }
    public void showCreditSilver() {
        Silver.showCredit();
    }
}
