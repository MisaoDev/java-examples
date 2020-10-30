package sapo.examples.ejemplosbásicos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import static sapo.examples.ejemplosbásicos.WordWrap.wrapText;

/**
 * Despliega un menú y llama al método main de la clase correspondiente al ejemplo seleccionado por el usuario.
 * 
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Main {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    String[][] ejemplos = {
      {"Parsing",     "Lectura y validación de hora y fecha en un formato específico."},
      {"WordWrap",    "Método para ajustar texto usando manipulación básica de Strings."},
    };
    
    for (int i = 0; i < ejemplos.length; i++) {
      System.out.println(wrapText(String.format("%02d. %-10s- %s%n", i, ejemplos[i][0], ejemplos[i][1]), 80));
    }
    
    System.out.print("Ingrese una opción >");
    int opción = entrada.nextInt();
    entrada.nextLine(); //bug-fix
    
    if (opción < 0 || opción >= ejemplos.length) {
      System.out.println("Opción inválida");
      return;
    }
    
    String nombreClase = ejemplos[opción][0];
    Class clase = null;
    Method método = null;
    
    try {
      clase = Class.forName("sapo.examples.ejemplosbásicos." + nombreClase);
    } catch (ClassNotFoundException e) {
      System.out.println("no");
    }
    
    try {
      método = clase.getMethod("main", String[].class);
    } catch (NoSuchMethodException e) {
    }
    
    try {
      método.invoke(null, (Object) null);
    } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
      System.out.println(e);
    }
    
  }
  
}
