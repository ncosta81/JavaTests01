package Arrays;

public class Arrays_Bucles {
    static void main(String[] args) {
        String[] productos={"Martillo",
                            "Destornillador",
                            "Taladro",
                            "Llave inglesa",
                            "Pinzas"};

        /*for (int f=0; f<productos.length; f++){
            System.out.println("Producto "+f+": "+productos[f]);
        }*/
        int f=0;
        while (f<productos.length){
            System.out.println("Producto "+f+": "+productos[f]);
            f++;
        }


    }
}
