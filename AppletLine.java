import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class AppletLine extends Applet{
 	public void paint(Graphics g){
		g.drawLine(20, 20, 120, 160); //Diferentes coordenadas x1 y1 x2 y2
	}	
}