package Arrays;

public class Arrays_Combinacion {
    static void main(String[] args) {
        String[] productos={"",
                            "Martillo",
                            "Destornillador",
                            "Taladro",
                            "Llave inglesa",
                            "Pinzas"};
        double[] precios={  0,
                            12.50,
                            3.85,
                            68.30,
                            11,
                            6.25};

        for (int f=1; f<productos.length; f++){
            System.out.println(productos[f]+": "+precios[f]+"€");
        }



    }
}
