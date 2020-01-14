import java.awt.*;
import java.applet.*;
public class  Animacion3 extends Applet{
  public void paint(Graphics g){



    g.drawString (palabra, 100,90);
    palabra=palabra+x;

  }
  private String palabra="Funciona #"; //Variable global
  String x="x";
}
