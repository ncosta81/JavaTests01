package Arrays;

public class Arrays_Enteros {
    static void main(String[] args) {

        //Declaración de un array.
        int[] numeros;

        //Creación del array.
        numeros=new int[5];

        //Inicialización del array.
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        //Creación+Inicialización de otro array.
        int[] valores={123,456,789};

        //Consulta del array.
        System.out.println("Primer elemento del array: "+numeros[0]);
        //Consulta del otro array.
        System.out.println("Segundo elemento del otro array: "+valores[1]);
    }
}
