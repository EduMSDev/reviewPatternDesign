package creational.prototype;

import java.util.HashMap;
import java.util.Map;
import static creational.prototype.PrototypeFactory.CarType.VISA;
import static creational.prototype.PrototypeFactory.CarType.AMEX;

public class PrototypeFactory {

	public static class CarType{
		public static final String VISA = "visa";
		public static final String AMEX = "amex";
	}
	
	private static Map<String, PrototypeCard> prototypes = new HashMap<>();
	
	public static PrototypeCard getInstance (final String tipo) throws CloneNotSupportedException{
		return prototypes.get(tipo).clone();
	}
	
	public static void loadCard() {
		Visa visa = new Visa();
		visa.setName("Esta tarjeta es Visa con numero 000");
		prototypes.put(VISA,visa);
		
		Amex amex = new Amex();
		amex.setName("Esta tarjeta es Amex con numero 111");
		prototypes.put(AMEX, amex);
	}
}
