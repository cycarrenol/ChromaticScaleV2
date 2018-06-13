package projectcolor;

import java.util.Random;

public class Generator {

    public Generator() {
    }

    int Numaleatorio = 0;
    Random Aleatorio = new Random();

    public int genNumAleatorio() {

        Numaleatorio = 1 + Aleatorio.nextInt(1080);
//      Numaleatorio = 1 + Aleatorio.nextInt(1);

        return Numaleatorio;

    }

}
