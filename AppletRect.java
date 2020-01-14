import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class AppletRect extends Applet{
 	public void paint(Graphics g){
		g.fillRect(20, 20, 120, 160); //Diferentes coordenadas x y ancho alto solo contorno
	}	
}