import java.awt.*;     //Libreria
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso
import java.util.Random.*;
import java.util.*;
public class examen extends Applet{
  public void paint(Graphics g){
    int diameter1=(getSize().width)/10;
    int diameter2=(getSize().height)/10;
    int diameter=(diameter1*diameter2)/60;
    int appletWidth=getSize().width; //Obtener el ancho del html
    int appletHeight=getSize().height; //Obtener la altura del html

    Color u=new Color(000,000,255); //Codigo RGB Azul
    g.setColor(u);
    int xxxMargin=(appletWidth-(diameter*3))/2; //Para centrarlo tomando en cuenta el diametro //Cuando queira centrar dibido entre dos y resto ancho y alto
    int yxxMargin=(appletHeight-(diameter*3))/2;
    g.fillOval(xxxMargin,yxxMargin,diameter*3,diameter*3);

    Color z=new Color(255,254,000); //Codigo RGB Amarillo
    g.setColor(z);
    int xxMargin=(appletWidth-(diameter*2))/2; //Para centrarlo tomando en cuenta el diametro //Cuando queira centrar dibido entre dos y resto ancho y alto
    int yxMargin=(appletHeight-(diameter*2))/2;
    g.fillOval(xxMargin,yxMargin,diameter*2,diameter*2);

    Color c=new Color(255,000,000); //Codigo RGB ROJO
    g.setColor(c);
    int xMargin=(appletWidth-diameter)/2; //Para centrarlo tomando en cuenta el diametro //Cuando queira centrar dibido entre dos y resto ancho y alto
    int yMargin=(appletHeight-diameter)/2;
    g.fillOval(xMargin,yMargin,diameter,diameter);

    Color p=new Color(000,000,000); //Codigo RGB ROJO
    g.setColor(p);
    int x;
    int y;
    lanzados = lanzados+1;
    x = (int) (Math.random()*appletWidth)+1;
    y= (int)(Math.random()*appletHeight)+1;

    if((x>xxxMargin) & (y>yxxMargin) & (x<(xxxMargin+diameter*3)) &(y<(yxxMargin+diameter*3)) ){
      aciertos=aciertos+1;
    }
    g.drawString(flecha,x,y);

    g.drawString(texto+aciertos+" de "+ lanzados, xMargin,400);

    g.drawString("Tu promedio de exito es: "+ (aciertos/lanzados)*100, xMargin,450);
  }
  private String flecha="x";
  private String texto="Tus aciertos han sido: ";
  double aciertos=0;
  double lanzados=0;
  double promedio=0;
}
