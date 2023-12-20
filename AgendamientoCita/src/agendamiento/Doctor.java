
package agendamiento;

/**
 *
 * @author Xelan
 */
public class Doctor extends Persona{
    private final String codDoc;
 private static int num=1;
 public Doctor(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña) {
        super(nombre, apellidos, cedula, telefono, email, contraseña);
        codDoc="D-00"+num;
        num++;
    }
 public String getcodDoc(){return this.codDoc;}
}
