package sapo.examples.ejemplosbásicos;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Parsing {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    do {
      
      System.out.println("Ingrese una fecha en el formato AAAA-MM-DD.");
      String fecha = entrada.nextLine();
      System.out.println("");
      
      try {
        LocalDate.parse(fecha);
        break;
      } catch (Exception e) {
        System.out.println("La fecha no es válida o no está en el formato correcto.");
      }
      
    } while (true);
    
  }
  
}
