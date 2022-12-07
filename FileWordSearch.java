import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWordSearch{
   FileWordSearch() throws IOException 
   {
      File f1=new File("input.txt"); 
      String[] words=null;  //arreglo de palabras
      FileReader fr = new FileReader(f1);  
      BufferedReader br = new BufferedReader(fr); //buffer de lectura
      String s;     
      String input="camino";   // palabra a buscar
      int count=0;   
      int line_count=0;
      while((s=br.readLine())!=null)   //lee el contenido
      {
        line_count++;
         words=s.split(" ");  //hace split por espacios
          for (String word : words) 
          {
                 if (word.equals(input))   //busca la palaba
                 {
                   count++;    //si se encuentra, aumenta cuenta
                   System.out.println("Se encontro: "+ input +  " en la linea "+line_count);
                 }
          }
      }
      if(count!=0)  //si la cuenta es dif a cero
      {
         System.out.println("En total, se encontro la palabra " +input + " ,"+count+ " veces en el archivo ");
      }
      else
      {
         System.out.println("No se encontro la palabra "+ input + "en el archivo");
      }    
         fr.close();
   }
}
