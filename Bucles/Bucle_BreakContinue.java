package Bucles;

public class Bucle_BreakContinue {
    static void main(String[] args) {
        int control=0, f=0;

        /*System.out.println("Cargando registros...");
        while (f<=10){
            f++;
            if (f==7){
                System.out.println("Carga completa");
                break;
            }
        }
        System.out.println("Se salió del bucle");*/

        for (int g=0; g<=20; g++){
            if (g%2==0){
                continue;
            }
            System.out.println("g: "+g);
        }
    }
}
