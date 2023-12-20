
package agendamiento;

/**
 *
 * @author Xelan
 */
public class Paciente extends Persona{
 private final String codPaciente;
 private static int num=1;
    public Paciente(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña) {
        super(nombre, apellidos, cedula, telefono, email, contraseña);
        codPaciente="P-00"+num;
        num++;
    }
 
    public String getcodPaciente(){return this.codPaciente;}

}
