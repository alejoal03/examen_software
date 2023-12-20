
package agendamiento;

/**
 *
 * @author Xelan
 */
public class GestorUsuario {
    
    private  Paciente[] listaPaciente;
    private  Doctor[] listaDoc;
    private Administrador[] listaadmin;
    
    public GestorUsuario(){
       this.listaPaciente = new Paciente[51];
       this.listaDoc = new Doctor[31];
       this.listaadmin= new Administrador[11];
    }
    
    public String crearPaciente(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña){
        String cod=null;
        for (int i=0;i<listaPaciente.length; i++) {
            if(listaPaciente[i]==null){
                listaPaciente[i]= new Paciente(nombre,apellidos, cedula, telefono, email,contraseña);
                cod=listaPaciente[i].getcodPaciente();
                return cod;
            }
        }
        return cod;
    }
    
    public Paciente encontrarPaciente(String cod, String clave){
    for(Paciente pacit: listaPaciente){
        if(pacit!=null&&cod.equals(pacit.getcodPaciente())){
            if(clave.equals(pacit.getcontras())){
            return pacit;
             }
         }
    }   
        return null; }
    
    public String crearDoctor(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña){
       String cod=null;
       for (int i=0;i<listaDoc.length; i++) {
            if(listaDoc[i]==null){
                listaDoc[i]= new Doctor(nombre,apellidos, cedula, telefono, email,contraseña);
                cod=listaDoc[i].getcodDoc();
                return cod;
            }
        }
        return cod;
    }
    
    public Doctor encontrarDoc(String cod, String clave){
    for(Doctor Docit: listaDoc){
        if(Docit!=null&&cod.equals(Docit.getcodDoc())){
            if(clave.equals(Docit.getcontras())){
            return Docit;
             }
         }
    }   
        return null; }
    
    
    
      public String crearAdmin(String nombre, String apellidos, String cedula, String telefono, String email, String contraseña){
        String cod=null;
          for (int i=0;i<listaadmin.length; i++) {
            if(listaadmin[i]==null){
                listaadmin[i]= new Administrador(nombre,apellidos, cedula, telefono, email,contraseña);
                cod=listaadmin[i].getcodAdm();
                return cod;
            }
        }
          return cod;
    }
      
      public Administrador encontrarAdmin(String cod, String clave){
    for(Administrador admit: listaadmin){
        if(admit!=null&&cod.equals(admit.getcodAdm())){
            if(clave.equals(admit.getcontras())){
            return admit;
             }
         }
    }   
        return null; }
}
    
    
    
   
 

