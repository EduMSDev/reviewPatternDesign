package behavioral.strategy;

public class LowerStrategyTestFomartter implements StrategyTextFormatter{

	@Override
	public void format(String text) {
		System.out.println("texto en minusculas:"+text.toLowerCase());	
	}
	

}
