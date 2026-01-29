package Operadores;

import java.util.Scanner;

public class Operadores {
    static void main(String[] args) {
        int valor1, valor2, resultado;

        //Ingreso de datos.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor 1...");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese valor 2...");
        valor2 = entrada.nextInt();

        //Operador suma.
        resultado = valor1 + valor2;
        System.out.println("La suma da: "+resultado);

        //Operador resta.
        resultado = valor1 - valor2;
        System.out.println("La resta da: "+resultado);

        //Operador multiplicación.
        System.out.println("La multiplicación da: "+ valor1 * valor2);

        //Operador división.
        System.out.println("La división da: "+ valor1 / valor2);

        //Operador residuo.
        resultado = valor1 % valor2;
        System.out.println("El resto de la división es: "+ resultado);


    }
}
