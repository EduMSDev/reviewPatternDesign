import structural.bridge.ClassicCreditCard;
import structural.bridge.SecureCreditCard;
import structural.bridge.UnsecureCreditCard;
import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Card;
import creational.abstractfactory.FactoryProvider;
import creational.abstractfactory.PaymentMethod;
import creational.factorymethod.Payment;
import creational.factorymethod.PaymentFactory;
import creational.factorymethod.TypePayment;

import static creational.prototype.PrototypeFactory.CarType.VISA;

import behavioral.chainofresponsibility.Tarjeta;
import behavioral.command.CreditCard;
import behavioral.command.CreditCardActivateCommand;
import behavioral.command.CreditCardDesactivateCommand;
import behavioral.command.CreditCardInvoker;
import behavioral.interpreter.AndExpression;
import behavioral.interpreter.Expression;
import behavioral.interpreter.OrExpression;
import behavioral.interpreter.TerminalExpression;
import behavioral.iterator.CardList;
import behavioral.iterator.Iterator;
import behavioral.iterator.List;
import behavioral.mediator.ConcreteColleage;
import behavioral.mediator.ConcreteColleage2;
import behavioral.mediator.ConcreteMediator;
import behavioral.memento.Article;
import behavioral.memento.ArticleMemento;
import behavioral.memento.Carataker;
import behavioral.observer.Coche;
import behavioral.observer.MessagePublisher;
import behavioral.observer.Peaton;
import behavioral.observer.Semaforo;
import behavioral.status.MobileAlertStateContext;
import behavioral.status.Silent;
import behavioral.status.Vibration;
import behavioral.strategy.CapitalStrategyTestFomartter;
import behavioral.strategy.Context;
import behavioral.strategy.LowerStrategyTestFomartter;
import behavioral.templateMethod.AppleCard;
import behavioral.templateMethod.Paypal;
import behavioral.visitor.BlackClassicCreditCardVisitor;
import behavioral.visitor.ClassicCreditCardVisitor;
import behavioral.visitor.OfertaElement;
import behavioral.visitor.OfertaGasolina;
import behavioral.visitor.OfertaVuelos;

import static creational.prototype.PrototypeFactory.CarType.AMEX;

import creational.prototype.PrototypeCard;
import creational.prototype.PrototypeFactory;
import structural.composite.CuentaAhorro;
import structural.composite.CuentaComponent;
import structural.composite.CuentaCorriente;
import structural.composite.CuenteComposite;
import structural.decorator.*;
import structural.facade.CreditMarket;
import structural.flyweight.Enemy;
import structural.flyweight.EnemyFactory;
import structural.proxy.Internet;
import structural.proxy.ProxyInternet;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //CREACIONALES
        //testingAsbtractFactoryMethod();
        //probarAbstractFactory();
        //probarBuilder();
        //probarPrototype();
        //probarSinglenton();

        //COMPORTAMIENTO
        //probarChainOfResponsabality();
        //probarCommand();
        //probarIterator();
        //probarMediator();
        //probarMemento();
        //probarObserver();
        //probarState();
        //probarInterpreter();
        //probarStrategyText();
        //probarTemplate();
        //probarVisitor();

        //ESTRUCTURAL
        //probarAdapter();
        //probarBridge();
        //probarComposite();
        //probarDecorator();
        //probarFacade();
        //probarFyweight();
        probarProxy();
    }

    private static void probarProxy() {
        Internet internet = new ProxyInternet();
        try {
            internet.connecTo("udemy.com");
            internet.connecTo("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void probarFyweight() {
        for (int i = 0; i < 15; i++) {
            Enemy enemy = EnemyFactory.getEnemy(getRandomType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }

    private static String getRandomType() {
        Random r = new Random();
        int randint = r.nextInt(enemyType.length);
        return enemyType[randint];
    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int randint = r.nextInt(weapon.length);
        return weapon[randint];
    }

    private static String[] enemyType = {"Private", "Detective"};
    private static String[] weapon = {"Gun", "Fusil", "Pistola", "Sniper"};

    private static void probarFacade() {
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditGold();
        creditMarket.showCreditBlack();
        creditMarket.showCreditSilver();
    }

    private static void probarDecorator() {
        Credit gold = new Gold();
        Credit black = new Black();
        black = new InternationalPaymentDecorator(black);

        Credit goldSecure = new Gold();
        gold = new InternationalPaymentDecorator(gold);
        gold = new SecureDecorator(goldSecure);

        gold.showCredit();
        black.showCredit();
        goldSecure.showCredit();
    }

    private static void probarComposite() {
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000, "Alberto");
        CuentaComponent cuentaAhorro = new CuentaAhorro(1000, "jose");
        CuenteComposite cuenteComposite = new CuenteComposite();
        cuenteComposite.addCuenta(cuentaAhorro);
        cuenteComposite.addCuenta(cuentaCorriente);

        cuenteComposite.showAccountName();
        cuenteComposite.getAmount();
    }

    private static void probarBridge() {
        structural.bridge.CreditCard classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();
        classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.realizarPago();
    }

    private static void probarAdapter() {
        structural.adapter.CreditCard creditCard = new structural.adapter.CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }

    private static void probarVisitor() {
        OfertaElement ofertaElement = new OfertaGasolina();
        ofertaElement.accept(new BlackClassicCreditCardVisitor());

        ofertaElement = new OfertaVuelos();
        ofertaElement.accept(new ClassicCreditCardVisitor());
    }

    private static void probarTemplate() {
        behavioral.templateMethod.Payment payment = new AppleCard();
        payment.makePayment();

        payment = new Paypal();
        payment.makePayment();
    }

    private static void probarStrategyText() {
        Context context = new Context(new CapitalStrategyTestFomartter());
        context.publishText("Se ha convertido en mayusculas.");

        context = new Context(new LowerStrategyTestFomartter());
        context.publishText("Esto sera para las minusculas.");
    }

    private static void probarInterpreter() {
        Expression cero = new TerminalExpression("0");
        Expression uno = new TerminalExpression("1");

        Expression containBoolean = new OrExpression(cero, uno);
        Expression containsOneAndCero = new AndExpression(cero, uno);

        System.out.println(containBoolean.interpret("cero"));
        System.out.println(containBoolean.interpret("0"));

        System.out.println(containsOneAndCero.interpret("0"));
        System.out.println(containsOneAndCero.interpret("0, 1"));
    }

    private static void probarState() {
        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.setState(new Vibration());
        context.alert();
        context.setState(new Silent());
        context.alert();
    }

    private static void probarObserver() {
        Coche coche = new Coche();
        Peaton peaton = new Peaton();

        MessagePublisher message = new MessagePublisher();

        message.attach(coche);
        message.attach(peaton);
        message.notifyUpdate(new Semaforo("ROJO_COCHE"));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        message.notifyUpdate(new Semaforo("VERDE_COCHE"));

    }

    private static void probarMemento() {
        Carataker carataker = new Carataker();
        Article article = new Article("Alberto", "Memento es una pelicula");
        article.setText(article.getText() + " de Nolan");
        System.out.println(article.getText());

        carataker.addMemento(article.createMemento());
        article.setText(article.getText() + " protagonizada por Leo");
        System.out.println(article.getText());

        carataker.addMemento(article.createMemento());

        article.setText(article.getText() + "y leonardo di caprio");
        System.out.println(article.getText());

        ArticleMemento memento1 = carataker.getMemento(0);
        ArticleMemento memento2 = carataker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println(article.getText());

        article.restoreMemento(memento2);
        System.out.println(article.getText());


    }

    private static void probarMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleage user1 = new ConcreteColleage(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);
        user1.send("Hola soy user1");
        user2.send("Hola soy user2");

    }

    private static void probarIterator() {
        behavioral.iterator.Card[] cards = new behavioral.iterator.Card[5];
        cards[0] = new behavioral.iterator.Card("visa");
        cards[1] = new behavioral.iterator.Card("amex");
        cards[2] = new behavioral.iterator.Card("mastercard");
        cards[3] = new behavioral.iterator.Card("google card");
        cards[4] = new behavioral.iterator.Card("apple card");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            behavioral.iterator.Card tarjeta = (behavioral.iterator.Card) iterator.next();
            System.out.println(tarjeta.getType());
        }
    }

    private static void probarCommand() {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDeactive = new CreditCard();

        CreditCardInvoker invoker = new CreditCardInvoker();
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("------------------------------");
        invoker.setCommand(new CreditCardDesactivateCommand(creditCardDeactive));
        invoker.run();
    }

    private static void probarChainOfResponsabality() {
		
		/*Use the Chain of Responsibility pattern when your program must process different types of requests in various ways, 
		but the exact types of requests and their sequences are not known in advance.*/
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.creditCardRequest(1000);
    }

    private static void probarSinglenton() {
        creational.singlenton.Card.getInstance().setCardNumber("fdfd");
        ;
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
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card card = (Card) abstractFactory.create("VISA");
        System.out.println(card.getCardNumber());
        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod payment = (PaymentMethod) abstractFactory1.create("Credit");
        System.out.println(payment.doPayment());

    }

    private static void probarBuilder() {
		/*The Builder pattern allows you to build products step by step. You can defer the execution of certain steps without 
		decomposing the final product. You can even invoke steps recursively, which is useful when you need to build a tree of objects. */
        creational.builder.Card card = new creational.builder.Card.CardBuilder("adri", "222").expires(2).credit(true).name("fsdf").build();
        System.out.println(card);
    }

    private static void probarPrototype() {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();
        } catch (CloneNotSupportedException e) {

        }
    }
}
