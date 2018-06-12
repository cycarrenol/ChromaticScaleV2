package projectcolor;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

// La funcion de esta clase es es enviar una petición de respuesta a la clase hija
//y así poder graficar el color recibido.
public class ProjectColor {

    public static void main(String[] args) throws InterruptedException {

        Generator objGen = new Generator();

        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 720;
        final int FRAME_HEIGHT = 170;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Escala cromática");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] arregloHex = new String[12];

        arregloHex[0] = "#14011f";
      
        arregloHex[1] = "#808000";
       
        arregloHex[2] = "#7800ff";
       
        arregloHex[3] = "#0a00fe";
       
        arregloHex[4] = "#0181fe";
       
        arregloHex[5] = "#00f2fe";
        
        arregloHex[6] = "#01ff7b";
      
        arregloHex[7] = "#37fe01";
       
        arregloHex[8] = "#c7ff03";
      
        arregloHex[9] = "#ff6801";
        
        arregloHex[10] = "#f00001";
        
        arregloHex[11] = "#5f0102";
       

        int dato =0;
      
        for (int j = 0; j < 35; j++) {

            int numAl = objGen.genNumAleatorio();
            String colorStr = arregloHex[numAl];

            int r = Integer.valueOf(colorStr.substring(1, 3), 16);
            int g = Integer.valueOf(colorStr.substring(3, 5), 16);
            int b = Integer.valueOf(colorStr.substring(5, 7), 16);

            Color fillColor = new Color(r, g, b);

            RectangleComponent component = new RectangleComponent(fillColor, dato);
           
         
           frame.add(component);
             frame.setVisible(true);
                  
             dato = dato+10;
             
              TimeUnit.SECONDS.sleep(1);
              
        }
        
                 


    }
}
