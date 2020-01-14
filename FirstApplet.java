import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class FirstApplet extends Applet{
 	public void paint(Graphics g){
		g.drawString("Welcome to java", 20, 20); //posicion x y Dibuja algo
	}	
}