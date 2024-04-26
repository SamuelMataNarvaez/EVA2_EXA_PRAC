/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva222222;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Eva222222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("ESCRIBE UN NUMERO 1(Piedra) o 2(Papel) o 3(Tijera), o cualquier otro numero para salir");
            int atinar = captu.nextInt();
            
            if (atinar < 1 || atinar > 3) {
                continuar = false;
                System.out.println("Saliendo del juego");
                break;
            }
            
            double juego = Math.random();
            String opcionJuego;

            if (juego < 0.33)
                opcionJuego = "Piedra";
            else if (juego < 0.66)
                opcionJuego = "Papel";
            else
                opcionJuego = "Tijera";

            System.out.println("LO QUE SACASTE EN LA MANO FUE: " + opcionJuego);

            if ((opcionJuego == "Piedra" && atinar == 3) || (opcionJuego == "Papel" && atinar == 1) || (opcionJuego == "Tijera" && atinar == 2))
                System.out.println("Ganaste");
            else if ((opcionJuego == "Piedra" && atinar == 2) || (opcionJuego == "Papel" && atinar == 3) || (opcionJuego == "Tijera" && atinar == 1))
                System.out.println("Perdiste");
            else
                System.out.println("Empate");
        }
    }
}
    

