package Arrays;

public class Arrays_Operaciones {
    static void main(String[] args) {
        int[] ventas1={500,600,400,100,650};
        int[] ventas2={600,800,500,350,900};
        int[] total=new int[ventas1.length];

        System.out.println("Suma de valores");
        for (int f=0; f<ventas1.length; f++){
            total[f]=ventas1[f]+ventas2[f];
            System.out.println(total[f]);
        }



    }
}
