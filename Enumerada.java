public class Enumerada {

    public enum Diasemana{
        Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo
    }

    public static void main(String[] args) {
        for (Diasemana dia : Diasemana.values()){
            System.out.println(dia);
        }

    }
}
