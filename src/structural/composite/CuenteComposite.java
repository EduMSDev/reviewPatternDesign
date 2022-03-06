package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CuenteComposite implements CuentaComponent{


    private List<CuentaComponent> childCuentas;

    public CuenteComposite() {
        this.childCuentas= new ArrayList<>();
    }

    @Override
    public void showAccountName() {
        this.childCuentas.forEach(cuentaComponent -> cuentaComponent.showAccountName());
    }

    @Override
    public double getAmount() {
        double totalAmmount=0;
        for (CuentaComponent cuentaComponent: this.childCuentas) {
            totalAmmount+=cuentaComponent.getAmount();
        }
        System.out.println("El dinero es "+totalAmmount);
        return  totalAmmount;
    }

    public void addCuenta(CuentaComponent cuenta){
        this.childCuentas.add(cuenta);
    }
    public void removeCuenta(CuentaComponent cuenta){
        this.childCuentas.remove(cuenta);
    }
}
