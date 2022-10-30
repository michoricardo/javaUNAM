// superclase cuenta bancaria
public class CuentaBancaria {

    private String nombre_titular;
    private String apellidos_titular;
    private int num_cuenta;
    private String tipo_cuenta;
//método constructor
    public CuentaBancaria (String nombre_titular, String apellidos_titular, int num_cuenta, String tipo_cuenta) { 
        this.nombre_titular = nombre_titular;
        this.apellidos_titular = apellidos_titular;
        this.num_cuenta = num_cuenta;  
        this.tipo_cuenta = tipo_cuenta;
    }
    //métodos superclase cuenta bancaria
    public String getNombre () { return nombre_titular;  }
    public String getApellidos () { return apellidos_titular;  }
    public int getNumcuenta () { return num_cuenta;   }
    public String getTipoCuenta () { return tipo_cuenta;   }

} 
