package behavioral.strategy;

public class Context {
	
	private StrategyTextFormatter strategyTextFormatter;
	
	public Context(StrategyTextFormatter strategyTextFormatter) {
		this.strategyTextFormatter = strategyTextFormatter;
	}
	
	public void publishText(String text) {
		this.strategyTextFormatter.format(text);
	}
	
}
