package Bucles;

import java.util.Scanner;

public class Bucle_DoWhile {
    static void main(String[] args) {
        int contador=1;
        final var valor=5;
        Scanner entrada = new Scanner(System.in);

        /*//Bucle DoWhile.
        do {
            System.out.println("Valor: "+contador++);
        }while (contador <= valor);*/

        int numero=0;
        do {
            System.out.println("Ingrese número 5...");
            numero=entrada.nextInt();
            if (numero!=5){
                System.out.println("No introdujiste 5");
            }
        }while(numero!=5);
    }
}
