package projectcolor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JComponent;

/**
 * 08: A component that draws two rectangles. 09:
 */
public class RectangleComponent extends JComponent {

    private int var = 0;

  
    
    public RectangleComponent(Color Color, int dato) {
        fillColor = Color;
        var = dato;
        //var = dato;

    }

    public void paintComponent(Graphics g) {

        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        
        g2.setColor(fillColor);
 
            Rectangle box = new Rectangle(1+var, 1, 1+var, 100);

            g2.fill(box);

            g2.draw(box);
            
    }

    private Color fillColor;

}

        
        /*

           
*/
        
        
        
        
        
        
        
        
        
        
       
       
