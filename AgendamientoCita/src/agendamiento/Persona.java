/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamiento;

/**
 *
 * @author Xelan
 */
public abstract class Persona {
   
    private final String nombre;
    private final String apellidos;
    private final String cedula;
    private String telefono;
    private String email;
    private String contras;

    // Constructor
    public Persona(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.contras = contraseña;   
    }
    
    public String getnombre(){return this.nombre;}
    public String getapellidos(){return this.apellidos;}
    public String getcedula(){return this.cedula;}
    public String telefono(){return this.telefono;}
    public String getemail(){return this.email;}
    public String getcontras(){return this.contras;}
   
}
