package Presentacion;
/**
 *
 * @author Andrés Mogollón S.
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class FondoFormulario extends javax.swing.JPanel {
public FondoFormulario(){
this.setSize(407, 394);
}
@ Override
public void paintComponent(Graphics g){
ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Presentacion/Imagenes/FondoFormulario.png" ) ) ;

g.drawImage(imagenFondo.getImage(),0,0,407, 394, null);
setOpaque(false);
super.paintComponent(g);
}

}
