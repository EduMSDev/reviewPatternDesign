package creational.prototype;

public class Visa implements PrototypeCard {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	@Override
	public void getCard() {
		System.out.println("Visa");
	}

	@Override
	public PrototypeCard clone() throws CloneNotSupportedException {
		System.out.println("Clonando Visa");
		return (Visa) super.clone();
	}

}
