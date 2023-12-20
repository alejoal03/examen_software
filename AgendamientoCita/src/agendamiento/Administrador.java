/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamiento;

/**
 *
 * @author Xelan
 */
public class Administrador extends Persona{
    
    private final String codAdm;
 private static int num=1;
 public Administrador(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña) {
        super(nombre, apellidos, cedula, telefono, email, contraseña);
        codAdm="A-00"+num;
        num++;
    }
 public String getcodAdm(){return this.codAdm;}
}
