package Condicionales;

import java.util.Scanner;

public class Condicional_SwitchCase {
    static void main(String[] args) {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos.
        System.out.println("Ingrese día a consultar");
        diaSemana = entrada.nextInt();

        /*switch (diaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }*/
        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default-> System.out.println("Número incorrecto");
        }
    }
}
