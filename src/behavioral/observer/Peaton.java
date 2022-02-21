package behavioral.observer;

public class Peaton implements Observer{

	@Override
	public void update(Semaforo semaforo) {
		if (semaforo.status.equals("ROJO_COCHE")) {
			System.out.println("Semaforo verde para peaton");
		}else {
			System.out.println("Semaforo Rojo para peaton");
		}
		
	}
	
	

}
