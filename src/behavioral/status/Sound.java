package behavioral.status;

public class Sound implements MobileAlertState{

	@Override
	public void alert(MobileAlertStateContext context) {
		System.out.println("Sonido");
	}
	

}
