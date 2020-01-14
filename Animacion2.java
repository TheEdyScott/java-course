import java.awt.*;
import java.applet.*;
public class  Animacion2 extends Applet{
  public void paint(Graphics g){
    if(red){
      g.setColor(Color.black);
      g.fillRect(0,100,100,100);
    }
    else{
      g.setColor(Color.black);
      g.fillRect(0,0,100,100);
    }




    if(red)
      red=false;
    else
      red=true;
  }
  private boolean red=true; //Variable global
}
