package Arrays;

import java.util.Arrays;

public class Arrays_Metodos {
    static void main(String[] args) {
        int[] numeros = {1,7,3,8,5,6,2,4};

        //Ver el array entero como texto.
        System.out.println("Array original: "+ Arrays.toString(numeros));
        //Organizar el array de enteros.
        Arrays.sort(numeros);
        System.out.println("Array organizado: "+ Arrays.toString(numeros));

        //Correlación de arrays.
        int[] numeros1 = {1,2,3};
        int[] numeros2 = {1,0,3};
        boolean iguales = Arrays.equals(numeros1,numeros2);
        System.out.println("Son iguales: "+iguales);

        //Metodo fill.
        int[] llenar = new int[5];
        Arrays.fill(llenar,1);
        System.out.println("Array llenado con fill: "+ Arrays.toString(llenar));

        //Como copiar un array.
        int[] original = {1,2,3};
        int[] copia = Arrays.copyOf(original,2);
        System.out.println("Array copiado: "+ Arrays.toString(copia));


    }
}
