/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoLazo;
import Acceso.Inicio;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author mavel
 */
public class EcoLazo {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            Inicio pantalla = new Inicio();
            pantalla.setLocationRelativeTo(null);
            pantalla.setVisible(true);
        });

    }
}
