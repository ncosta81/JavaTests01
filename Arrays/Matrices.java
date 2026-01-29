package Arrays;

public class Matrices {
    static void main(String[] args) {
        int[][] numeros = new int[3][3];

        //Llenando la matriz.
        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[0][2]=3;
        numeros[1][0]=4;
        numeros[1][1]=5;
        numeros[1][2]=6;
        numeros[2][0]=7;
        numeros[2][1]=8;
        numeros[2][2]=9;

        //Llenar con bucle for.
        int[][] cantidades = {
                {11,12,13},
                {21,22,23},
                {31,32,33}
        };
        System.out.println(cantidades[2][2]);
        System.out.println("");

        for (int f=0;f<cantidades.length;f++){
            for (int g=0;g<cantidades.length;g++){
                System.out.print(cantidades[f][g]+" ");
            }
            System.out.println(" ");
        }
    }
}
