
package generador;
/**
 * La clase Generador permite crear contraseñas aleatorias.
 * 
 * Esta clase genera contraseñas aleatorias combinando letras minúsculas,
 * letras mayúsculas, dígitos numéricos y caracteres especiales.
 * 
 * @author Julian Caro Santafe
 * @version 1.0
 */
import java.util.Random;
public class Generador {
    //-todoslosC:Todos los caracteres de la contraseña
 
private static final String lestrasmin = "abcdefghijklmnopqrstuvwxyz";
private static final String letrasmay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private static final String  num= "0123456789";
private static final String caracteres = "!@*_,.";
 /**
     * Genera una contraseña aleatoria de longitud dada.
     * 
     * @param length Longitud de la contraseña a generar.
      @return Una cadena que representa la contraseña aleatoria generada.
     * <ul>
     *<li>Contraseña aleatoria generada.</li>
     *</ul>
     */
public String generador(int length) {
    String todoslosC = lestrasmin + letrasmay + num + caracteres;
    Random random = new Random();
    StringBuilder contraseña = new StringBuilder();

    for (int i = 0; i < length; i++) {
        int indice = random.nextInt(todoslosC.length());
        char caracterA = todoslosC.charAt(indice);
        contraseña.append(caracterA);
    }
    return contraseña.toString();
}
             
}
