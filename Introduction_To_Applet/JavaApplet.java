import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class JavaApplet extends Applet {
    
    public void paint(Graphics g) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");
        
        setBackground(Color.cyan);
        
        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 100);
        
        g.setColor(Color.GREEN);
        g.drawOval(100, 100, 100, 100);
        
        g.setColor(Color.BLACK);
        g.drawString("Welcome to Java Applets", 80, 250);
    }

}