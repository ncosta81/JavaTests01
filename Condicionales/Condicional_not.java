package Condicionales;

public class Condicional_not {
    static void main(String[] args) {
        System.out.println("===MONITOR DE SISTEMA===");
        var enLinea = true;

        if(!enLinea){
            System.out.println("Sistema fuera de línea");
        }else {
            System.out.println("Sistema en línea");
        }
    }
}
