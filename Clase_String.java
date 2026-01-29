import java.util.Scanner;

public class Clase_String {
    static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos.
        System.out.println("Ingrese palabra 1...");
        palabra1 = entrada.next();
        System.out.println("Ingrese palabra 2...");
        palabra2 = entrada.next();

        //Comparar textos.
        if (palabra1.equals(palabra2)){
            System.out.println(palabra1+" es igual a "+palabra2);
        }else{
            System.out.println("no son palabras iguales");
        }

        //Comparar textos sin tener en cuenta mayúsculas.
        if (palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }

        //Comparar orden alfabético.
        if (palabra1.compareTo(palabra2)==0){
            System.out.println(palabra1+" es igual a "+palabra2);
        }else{
            if (palabra1.compareTo(palabra2)>0){
                System.out.println(palabra1+" va después de "+palabra2);
            }else{
                System.out.println(palabra1+" va antes de "+palabra2);
            }
        }

        //Comparar cantidad de carácteres.
        if (palabra1.length()==palabra2.length()){
            System.out.println(palabra1+" tiene las mismas letras que "+palabra2);
        }else{
            if (palabra1.length()>palabra2.length()){
                System.out.println(palabra1+" tiene más letras que "+palabra2);
            }else{
                System.out.println(palabra1+" tiene menos letras que "+palabra2);
            }
        }

        //Saber primer carácter de una palabra.
        char caracter = palabra1.charAt(0);
        System.out.println("Primera letra de "+palabra1+": "+caracter);

        //Indentificar varios carácteres en texto.
        System.out.println(palabra1.substring(5,6));

        //Buscar carácteres en otra cadena.
        int coincidencia = palabra1.indexOf(palabra2);
        if (coincidencia==-1){
            System.out.println(palabra1+" no contiene: "+palabra2);
        }else{
            System.out.println(palabra1+" tiene carácteres comunes con: "+palabra2);
        }

        //Llevar a mayúsculas.
        System.out.println(palabra1+" en mayúsculas es: "+palabra1.toUpperCase());
    }
}
