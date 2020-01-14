import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class AppletCirculoRectangulo extends Applet{
 	public void paint(Graphics g){
		
		
		Color b=new Color(20,10,80); //Codigo RGB
		g.setColor(b);
		g.fillOval(20, 20, 50, 50);



		Color m=new Color(255,255,10); //Codigo RGB
		g.setColor(m);
		g.fillRect(27, 27, 35, 37);

		
		
	}	
}