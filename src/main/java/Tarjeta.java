public class Tarjeta implements InterfazProxy{

    public boolean saca(CuentaCliente cuenta, float monto){
        if(cuenta.getSaldo() < monto){
            cuenta.setSaldo(cuenta.getSaldo()-monto);
            return true;
        }
        return false;
    }

    public boolean mete(CuentaCliente cuenta, float monto){
        cuenta.setSaldo(cuenta.getSaldo()+monto);
        return true;
    }

}
