package creational.abstractfactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod>{

	@Override
	public PaymentMethod create(String type) {
		if("Credit".equals(type)) {
			return new Credit();
		}else if("Debit".equals(type)){
			return new Debit();
		}
		return null;
	}

}
