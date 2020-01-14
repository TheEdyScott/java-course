import java.awt.*;     //Libreria
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class CenterCircleApplet extends Applet{
  public void paint(Graphics g){
    int diameter1=(getSize().width)/6;
    int diameter2=(getSize().height)/6;
    int appletWidth=getSize().width; //Obtener el ancho del html
    int appletHeight=getSize().height; //Obtener la altura del html

    int xRMargin=(appletWidth-diameter1)/2;
    int yRMargin=(appletHeight-diameter2)/4;

    int d=(getSize().height)/12;
    int dt=(diameter2*3)+d;
    g.drawRect(xRMargin,yRMargin, diameter1, dt );


    Color z=new Color(255,000,000); //Codigo RGB ROJO
    g.setColor(z);
    int xxMargin=(appletWidth-diameter1)/2; //Para centrarlo tomando en cuenta el diametro //Cuando queira centrar dibido entre dos y resto ancho y alto
    int yxMargin=(appletHeight-diameter2)/4;
    g.fillOval(xxMargin,yxMargin,diameter1,diameter2);

    Color c=new Color(255,254,000); //Codigo RGB AMARILLO
    g.setColor(c);
    int xMargin=(appletWidth-diameter1)/2; //Para centrarlo tomando en cuenta el diametro //Cuando queira centrar dibido entre dos y resto ancho y alto
    int yMargin=(appletHeight-diameter2)/2;
    g.fillOval(xMargin,yMargin,diameter1,diameter2);


    Color u=new Color(000,247,000); //Codigo RGB VERDE
    g.setColor(u);
    int xxxMargin=(appletWidth-diameter1)/2; //Para centrarlo tomando en cuenta el diametro //Cuando queira centrar dibido entre dos y resto ancho y alto
    int yxxMargin=((appletHeight-diameter2)/2)+yxMargin;
    g.fillOval(xxxMargin,yxxMargin,diameter1,diameter2);



  }
}
