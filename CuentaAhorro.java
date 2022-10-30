//Saldo de la cuenta, interés mensual aplicado a la cuenta
public class CuentaAhorro extends CuentaBancaria {
    //Campos específicos de la subclase.
    private String IdCuentaAhorro;
    private int saldo_cuenta;
    private int int_mensual;
    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public CuentaAhorro (String nombre_titular, String apellidos_titular, int num_cuenta, String tipo_cuenta) {

        super(nombre_titular, apellidos_titular, num_cuenta,tipo_cuenta);
        IdCuentaAhorro = null;   
        saldo_cuenta = 0;
        int_mensual = 0;     
    } //Cierre del constructor
    //Métodos específicos de la subclase
    public void setIdCuentaAhorro (String IdCuentaAhorro) { this.IdCuentaAhorro = IdCuentaAhorro;   }
    public void setSaldoCuenta (int saldo_cuenta) { this.saldo_cuenta = saldo_cuenta;}
    public void setIntMensual (int int_mensual) { this.int_mensual = int_mensual;}

    public int getSaldoCuenta () { return saldo_cuenta;   }
    public int getIntMensual () { return int_mensual;   }
    public String getIdCuentaAhorro () { return IdCuentaAhorro;   }
    public void mostrarDatosAhorro() {
        System.out.println ("\n------------------------------------");
        System.out.println ("Nombre titular: " + getNombre() + " " +  getApellidos() + "\nID cuenta de ahorro " + getIdCuentaAhorro() +"\nTipo de cuenta: " + getTipoCuenta() +"\nNumero de cuenta: " + getNumcuenta() +"\nSaldo de cuenta: " + getSaldoCuenta() +"\nInterés mensual: " + getIntMensual()+"%" ); }
}
