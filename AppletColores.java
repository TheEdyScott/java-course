import java.awt.*;     //Libreria 
import java.applet.*; //Impotamos libreria comvierte la aplicacion en un lienso

public class AppletColores extends Applet{
 	public void paint(Graphics g){
		Color c=new Color(180,10,120); //Codigo RGB
		g.setColor(c);
		g.drawString("Ejemplo de colores",20,20);

		Color v=new Color(100,10,180); //Codigo RGB
		g.setColor(v);
		g.drawLine(130, 60, 120, 160);
		
		Color b=new Color(20,10,80); //Codigo RGB
		g.setColor(b);
		g.fillOval(130, 90, 120, 160);

		Color n=new Color(10,100,40); //Codigo RGB
		g.setColor(n);
		g.drawOval(130, 250, 120, 160);

		Color m=new Color(50,64,10); //Codigo RGB
		g.setColor(m);
		g.fillRect(130, 430, 120, 160);

		Color a=new Color(78,50,180); //Codigo RGB
		g.setColor(a);
		g.drawRect(130, 600, 120, 160);
		
	}	
}