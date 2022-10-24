/* Dadas las lecturas de la estatura de 10 personas, hacer un programa en Java para determinar
la media y la desviación estándar de las estaturas y determinar la estatura menor a la media y
la estatura mayor a la media.


Paso 1: calcular la media.
Paso 2: calcular el cuadrado de la distancia a la media para cada dato.
Paso 3: sumar los valores que resultaron del paso 2.
Paso 4: dividir entre el número de datos.
Paso 5: sacar la raíz cuadrada.
*/
class Main {  
  public static void main(String args[]) { 
  int[] califs = {1, 2, 3, 4, 5, 6};
         
        double suma = 0;
        double suma2 = 0;
         
        //suma
        int i=0;
        while(i < califs.length) {
            suma += califs[i];
            i++;
        }
         
        //media
        double media = (suma / califs.length); 
        
        //cuadrado de diferencia de media p c/estatura
        int y=0;
        while(y < califs.length) {
            suma2 += Math.pow((califs[y]-media),2);
            y++;
        }
        System.out.println("suma2 : "+suma2);
        double de= Math.sqrt(suma2/califs.length);
    
         
        System.out.println("Promedio : "+media);
        System.out.println("Desviación estándar : "+de);

  } 
}
