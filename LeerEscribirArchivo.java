import java.io.*;
public class LeerEscribirArchivo {
FileWriter fw = null;
FileReader fr = null;
LeerEscribirArchivo() throws IOException {
String nombre_archivo= "Archivo.txt";
//Creacion de archivo
try {
fw = new FileWriter(nombre_archivo);
System.out.println("Archivo"+ nombre_archivo + " creado exitosamente \n");
String contenido_escribir = "Esto es una prueba :) ";
fw.write(contenido_escribir);
System.out.println("Contenido escrito...\n");
} catch (IOException e) {
System.out.println("Error al crear archivo");
e.printStackTrace();
} finally {
if (fw != null) {
fw.close();
}
}
//Lectura de archivo
try {
fr = new FileReader(nombre_archivo);
int contenido_leer = fr.read();
System.out.println("Leyendo contenido del archivo...\n");
while (contenido_leer != -1) {
System.out.print((char)contenido_leer);
  contenido_leer = fr.read();
}
} catch (IOException e) {
System.out.println("Error al leer archivo");
e.printStackTrace();
} finally {
fr.close();
}
}
}
