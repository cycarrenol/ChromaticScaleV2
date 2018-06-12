package projectcolor;

import java.util.Random;

public class Generator {

    public Generator() {
    }
    
    int Numaleatorio = 0;
    Random Aleatorio = new Random();
    
    public int genNumAleatorio(){
        
        Numaleatorio = 0 + Aleatorio.nextInt(12);
        return Numaleatorio;
        
    }
    
    
}
