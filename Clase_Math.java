public class Clase_Math {
    static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
        //System.out.println("Ingrese número sobre el que realizar los cálculos...");
        int valor=9;//=entrada.nextInt();

        //Cálculo de raiz cuadrada.
        System.out.println("Raiz de: "+valor+" = "+Math.sqrt(valor));

        //Cálculo de la potencia.
        var base = 2;
        var exponente = 3;
        System.out.println("Potencia de 2 a la 3 = "+Math.pow(base,exponente));

        //Valor absoluto.
        var absoluto = 2.5;
        System.out.println("Valor absoluto de: "+absoluto+" = "+Math.abs(absoluto));

        //Identificar mayor y menor valor.
        var num1=50.2;
        var num2=3;
        System.out.println("El mayor valor es: "+Math.max(num1,num2));
        System.out.println("El mayor valor es: "+Math.min(num1,num2));

        //Redondeos de valor.
        var total=5.6864;
        System.out.println(total+" redondeada al entero más cercano es: "+Math.round(total));
        System.out.println(total+" redondeada con truncamiento es: "+Math.floor(total));
        System.out.println(total+" redondeada al entero siguiente es: "+Math.ceil(total));

        //Número aleatorio.
        double aleatorio=Math.round(Math.random()*10);
        System.out.println("Número aleatorio: "+aleatorio);

        //Número PI
        System.out.println("Valor de PI: "+Math.PI);

        //Seno y coseno.
        System.out.println("Seno de 60rad= "+Math.sin(60));
        System.out.println("Coseno de 60rad= "+Math.cos(60));

        //Logaritmo.
        var log=100;
        System.out.println("Logaritmo de: "+log+" = "+Math.log(log));

        //Logaritmo en base 10.
        var log10=100;
        System.out.println("Logaritmo de: "+log10+" = "+Math.log10(log10));
    }
}
