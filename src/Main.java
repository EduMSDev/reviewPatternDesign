import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Card;
import creational.abstractfactory.FactoryProvider;
import creational.abstractfactory.PaymentMethod;
import creational.factorymethod.Payment;
import creational.factorymethod.PaymentFactory;
import creational.factorymethod.TypePayment;
import static creational.prototype.PrototypeFactory.CarType.VISA;

import behavioral.chainofresponsibility.Tarjeta;

import static creational.prototype.PrototypeFactory.CarType.AMEX;
import creational.prototype.PrototypeCard;
import creational.prototype.PrototypeFactory;


public class Main {
	public static void main(String[] args) {
		//CREACIONALES
		//testingAsbtractFactoryMethod();
		//probarAbstractFactory();
		//probarBuilder();
		//probarPrototype();
		//probarSinglenton();
		
		//COMPORTAMIENTO
		probarChainOfResponsabality();
		
	}
	
	private static void probarChainOfResponsabality() {
		
		/*Use the Chain of Responsibility pattern when your program must process different types of requests in various ways, 
		but the exact types of requests and their sequences are not known in advance.*/
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.creditCardRequest(1000);
	}
	
	private static void probarSinglenton () {
		creational.singlenton.Card.getInstance().setCardNumber("fdfd");;
		System.out.println(creational.singlenton.Card.getInstance().getCardNumber());
	}
	
	private static void testingAsbtractFactoryMethod() {
		/*One of its limitations is that the reserved word new always returns an 
		instance of the concrete type that is explicitly created,
		sometimes the concrete type of the instance is not known at compile time, 
		for example at compile time it is known that a Shape is 
		needed but only at run time it is not known if the instance to be built is a Square or a Circle.

		Another limitation is that the code that uses new has the responsibility of creating the instances, 
		sometimes it is interesting to delegate this responsibility to another class to avoid repeating it multiple times.*/
		
		Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
		payment.doPayment();
	}
	
	private static void probarAbstractFactory() {
		/*The Factory Method Design Pattern is intended to address the problem of creating objects without 
		having to specify the exact class to which they are to belong and without having to directly access the creation logic*/
		AbstractFactory abstractFactory= FactoryProvider.getFactory("Card");
		Card card = (Card) abstractFactory.create("VISA");
		System.out.println(card.getCardNumber());
		AbstractFactory abstractFactory1= FactoryProvider.getFactory("PaymentMethod");
		PaymentMethod payment= (PaymentMethod) abstractFactory1.create("Credit");
		System.out.println(payment.doPayment()); 
		
	}
	
	private static void probarBuilder() {
		/*The Builder pattern allows you to build products step by step. You can defer the execution of certain steps without 
		decomposing the final product. You can even invoke steps recursively, which is useful when you need to build a tree of objects. */
		creational.builder.Card card = new creational.builder.Card.CardBuilder("adri","222").expires(2).credit(true).name("fsdf").build();
		System.out.println(card);
	}
	
	private static void probarPrototype() {
		PrototypeFactory.loadCard();
		try {
			PrototypeCard visa = PrototypeFactory.getInstance(VISA);
			visa.getCard();
			
			PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
			amex.getCard();
		}catch(CloneNotSupportedException e){
			
		}
	}
}
