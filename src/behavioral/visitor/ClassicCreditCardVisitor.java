package behavioral.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor{

	@Override
	public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
		System.out.println("Descuento del 3% con tu tarjeta Clasica");
	}

	@Override
	public void ofertaVuelas(OfertaVuelos ofertaVuelos) {
		System.out.println("Descuento del 3% con tu tarjeta Clasica");
	}

}
