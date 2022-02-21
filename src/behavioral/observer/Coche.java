package behavioral.observer;

public class Coche implements Observer{

	@Override
	public void update(Semaforo semaforo) {
		if (semaforo.status.equals("ROJO_COCHE")) {
			System.out.println("Semaforo Rojo para coche");
		}else {
			System.out.println("Semaforo Verde para coche");
		}
		
	}
	
	

}
