import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class AppletOval extends Applet{
 	public void paint(Graphics g){
		g.fillOval(20, 20, 120, 160); //Diferentes coordenadas x y ancho alto
	}	
}