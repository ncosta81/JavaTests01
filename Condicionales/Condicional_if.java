package Condicionales;

import javax.swing.*;

public class Condicional_if {
    static void main(String[] args) {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null,"Ingresa nombre: ");
        String edad2 = JOptionPane.showInputDialog(null,"Ingresa edad: ");
        edad = Integer.parseInt(edad2);

        //Analizando datos.
        if (edad < 12){
            JOptionPane.showMessageDialog(null,"Eres un niño");
        }else if (edad>12 && edad<18){
            JOptionPane.showMessageDialog(null,"Eres adolescente");
        }else {
            JOptionPane.showMessageDialog(null,"Eres mayor de edad");
        }


    }
}
