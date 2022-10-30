public class CuentaInversion extends CuentaBancaria {
    //Campos específicos de la subclase.
    private String IdCuentaInversion;
    private int saldo_cuenta;
    private int int_mensual;
    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
    public CuentaInversion (String nombre_titular, String apellidos_titular, int num_cuenta,String tipo_cuenta) {

        super(nombre_titular, apellidos_titular, num_cuenta,tipo_cuenta);

        IdCuentaInversion = null;  
        saldo_cuenta = 0;
        int_mensual = 0;} //Cierre del constructor
    //Métodos específicos de la subclase
    public void setIdCuentaInversion (String IdCuentaInversion) { this.IdCuentaInversion = IdCuentaInversion;   }
    public String getIdCuentaInversion () { return IdCuentaInversion;   }
    public void setSaldoCuenta (int saldo_cuenta) { this.saldo_cuenta = saldo_cuenta;}
    public void setIntMensual (int int_mensual) { this.int_mensual = int_mensual;}

    public int getSaldoCuenta () { return saldo_cuenta;   }
    public int getIntMensual () { return int_mensual;   }
    public void mostrarDatosInversion() {
        System.out.println ("\n------------------------------------");
        System.out.println ("Nombre de titular: " + getNombre() + " " +  getApellidos() + "\ncon Id de cuenta de inversión:" + getIdCuentaInversion() +"\nTipo de cuenta: " + getTipoCuenta() + " \nNúmero de Cuenta: " + getNumcuenta()+"\nSaldo de cuenta: " + getSaldoCuenta() +"\nInterés mensual: " + getIntMensual()+"%" ); }
}
