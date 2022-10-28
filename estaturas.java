/* Dadas las lecturas de la estatura de 10 personas, hacer un programa en Java para determinar
la media y la desviación estándar de las estaturas y determinar la estatura menor a la media y
la estatura mayor a la media.
*/


class Main {
  public static void main(String args[])  {

    double[] estaturas = { 1.65, 1.50, 1.55, 1.65, 1.70, 1.75, 1.80, 1.45, 1.85, 1.95};


    double suma = 0;
    double suma2 = 0;

    // suma
    int i = 0;
    while (i < estaturas.length) {
      suma += estaturas[i];
      i++;
    }

    // media
    double media = (suma / estaturas.length);

    // cuadrado de diferencia de media p c/estatura
    int y = 0;
    while (y < estaturas.length) {
      suma2 += Math.pow((estaturas[y] - media), 2);
      y++;
    }
    //System.out.println("suma2 : " + suma2);
    double de = Math.sqrt(suma2 / estaturas.length);

    System.out.println("Estatura promedio : " + media);
    System.out.println("Desviación estándar : " + de);
    System.out.println("Las siguientes estaturas son menores a la media:");
  for (int j = 0; j < estaturas.length; j++) {
    if (estaturas[j] < media){
      System.out.println(estaturas[j]);
    }
    }
    System.out.println("Las siguientes estaturas son mayores a la media:");
  for (int j = 0; j < estaturas.length; j++) {
    if (estaturas[j] > media){
      System.out.println(estaturas[j]);
    }
  }
}
}
