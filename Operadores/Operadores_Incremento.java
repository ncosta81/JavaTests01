package Operadores;

public class Operadores_Incremento {
    static void main() {
        int valor1 = 5;
        System.out.println("Valor original: "+valor1);

        //Incrementamos valor1 postfijo.
        valor1++;
        System.out.println("Valor incrementado postfijo: "+valor1);

        //Incrementamos valor1 prefijo.
        valor1 = 5;
        ++valor1;
        System.out.println("Valor incrementado prefijo: "+valor1);

        //Incrementamos valor1 postfijo en 2.
        valor1 = 5;
        valor1+=2;
        System.out.println("Valor incrementado postfijo en 2: "+valor1);

        //Incremento fijo
        valor1 = 10;
        valor1*=3;
        System.out.println("Valor multiplicado por 3: "+valor1);

        //Incremento divisor.
        valor1 = 90;
        valor1/=2;
        System.out.println("Valor dividido entre 2: "+valor1);






    }
}
