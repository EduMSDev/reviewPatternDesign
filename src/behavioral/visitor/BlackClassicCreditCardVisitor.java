package behavioral.visitor;

public class BlackClassicCreditCardVisitor implements CreditCardVisitor{

	@Override
	public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
		System.out.println("Descuento del 10% con tu tarjeta Black");
	}

	@Override
	public void ofertaVuelas(OfertaVuelos ofertaVuelos) {
		System.out.println("Descuento del 10% con tu tarjeta Black");
	}

}
