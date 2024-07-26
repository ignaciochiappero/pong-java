/* PONG GAME:
 
PARTE 1: https://www.youtube.com/watch?v=fnJQLBPemcI --> Dibujado de tablero y de pelota
PARTE 2: https://www.youtube.com/watch?v=__gIMoOytwA --> Creado de Clase Hilo y pelota, movimiento de la pelota y control de velocidad
PARTE 3: https://www.youtube.com/watch?v=JXddypfpyWw --> Creacion de las Raquetas
PARTE 4: https://www.youtube.com/watch?v=3WJbSQqt1h8 --> Movimiento de las Raquetas
PARTE 5: https://www.youtube.com/watch?v=zMQ2sdFAvCQ --> Creacion de las colisiones con las raquetas y la pelota

*/
package principal;

import clases.Ventana;
import javax.swing.JFrame;


public class Principal {
    
    public static void main(String[] args) {
        
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
    
}
