/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoLazo;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

import Acceso.Inicio;

/**
 *
 * @author mavel
 */
public class EcoLazo {
    public static void main(String[] args) {
        UIManager.put("Button.arc", 20);
        UIManager.put("Component.arc", 16);
        UIManager.put("TextComponent.arc", 16);

        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            Inicio pantalla = new Inicio();
            pantalla.setVisible(true);
        });
    }
}
