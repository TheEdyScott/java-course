import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class AppletColor extends Applet{
 	public void paint(Graphics g){
		Color c=new Color(180,10,120); //Codigo RGB
		g.setColor(c);
		g.drawString("This is everyone's frist applet",20,20);
	}	
}