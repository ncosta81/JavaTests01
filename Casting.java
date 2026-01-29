public class Casting {
    static void main(String[] args) {
        //De texto a entero.
        String numeroTexto = "123";
        int numeroEntero;
        numeroEntero = Integer.parseInt(numeroTexto);

        System.out.println("Número en formato texto: "+numeroTexto);
        System.out.println("Número en formato numérico: "+numeroEntero);
        System.out.println("\n");

        //De entero a texto.
        int numEnt = 321;
        String numTexto;
        numTexto = String.valueOf(numEnt);

        System.out.println("Número en formato numérico: "+numEnt);
        System.out.println("Número en formato texto: "+numTexto);
        System.out.println("\n");

        //De doble a entero.
        double numDoble = 69.69;
        int dobleEntero;
        dobleEntero = (int)numDoble;
        System.out.println("Número doble: "+numDoble);
        System.out.println("Número entero: "+dobleEntero);
        System.out.println("\n");

        //De entero a doble.
        int nEnt = 69;
        double dobleNEnt;
        dobleNEnt = (double)nEnt;
        System.out.println("Número entero: "+nEnt);
        System.out.println("Número doble: "+dobleNEnt);
    }
}
