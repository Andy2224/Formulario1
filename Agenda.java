package Negocio.Modelo;
import Negocio.Control.Persona;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés Mogollón
 */
public class Agenda {
    Vector vector=new Vector();
    Persona persona=new Persona();

    public void GuardarPersona(Persona persona){
        if(vector.add(persona)){
            JOptionPane.showMessageDialog(null,"Se ha agregado correctamente la persona");

        }
    }
    public String MostrarAngenda(){
        String Linea="",Linea2;
            for(int x=0;x<vector.size();x++){
                persona=(Persona)vector.get(x);
                Linea2=persona.Nombre+" - "+persona.Apellidos+" "+persona.CI+" - "+persona.Telefono;
                Linea=Linea+Linea2+"\n";
            }
            return Linea;
}
    }
