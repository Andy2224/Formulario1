
package Negocio.Control;

/**
 *
 * @author Andrés Mogollón
 */
public class Persona {
    //variables
    public String Nombre;
    public String Apellidos;
    public String CI;
    public String Email;
    public String Telefono;

    //Constructores por parametros
    public Persona(String Nombre,String Apellidos,String CI, String Email,String Telefono){
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.CI=CI;
        this.Email=Email;
        this.Telefono=Telefono;
    }
    //Constructor por defecto
    public Persona(){
        
    }

}
