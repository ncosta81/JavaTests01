import javax.swing.*;

public class Input_Data_02 {
    static void main(String[] args) {
        String nombre;
        int edad;

        //Ingreso de datos.
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre...");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese edad...");
        edad = Integer.parseInt(edad2);

        //Salida de datos.
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n"+
                                                                     "Edad: "+edad);
    }
}
