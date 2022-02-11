package creational.prototype;

public class Amex implements PrototypeCard {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	@Override
	public void getCard() {
		System.out.println("Amex");
	}

	@Override
	public PrototypeCard clone() throws CloneNotSupportedException {
		System.out.println("Clonando Amex");
		return (Amex) super.clone();
	}

}
