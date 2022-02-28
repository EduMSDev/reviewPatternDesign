package behavioral.strategy;

public class CapitalStrategyTestFomartter implements StrategyTextFormatter{

	@Override
	public void format(String text) {
		System.out.println("texto en mayusculas:"+text.toUpperCase());	
	}
	

}
