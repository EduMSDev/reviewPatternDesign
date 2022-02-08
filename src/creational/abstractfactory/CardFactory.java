package creational.abstractfactory;

public class CardFactory implements AbstractFactory<Card> {

	@Override
	public Card create(String type) {
		if ("VISA".equals(type)) {
			return new Visa();
		}else if("Mastercard".equals(type)) {
			return new MasterdCard();
		}
		return null;
	}

}
