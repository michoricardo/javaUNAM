/* Realizar programa en Java empleando herencia de clases para una cuenta bancaria que
posee los siguientes atributos: Nombre del titular, Apellidos del titular, Número de la cuenta
bancaria, Tipo de cuenta: puede ser de ahorro o una cuenta de inversión, Saldo de la cuenta,
interés mensual aplicado a la cuenta.*/

public class Main {

  public static void main(String[] Args) {

    CuentaAhorro ahorro1 = new CuentaAhorro("Juan", "Hernández García", 1,"Ahorro");
    CuentaInversion inversion1 = new CuentaInversion("Lupe", "Ortiz Juárez",2,"Inversión");

    ahorro1.setIdCuentaAhorro("a001");
    ahorro1.setSaldoCuenta(500);
    ahorro1.setIntMensual(30);
    ahorro1.mostrarDatosAhorro();

    inversion1.setIdCuentaInversion("i001");
    inversion1.setSaldoCuenta(200);
    inversion1.setIntMensual(10);
    inversion1.mostrarDatosInversion();
  }

}
