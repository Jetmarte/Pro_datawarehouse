/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utiles;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *  Ventanas de mensajes
 * @author Jetmarte
 */
public class Mensaje {
  
  /**
   * Menaje simple emergente
   * @param texto 
   */
  public static void mensaje_simple(String texto){
    JOptionPane.showMessageDialog(null,texto);
  }
  
  /**
   * Mensaje condicional
   * @param mensage  String mensaje que mostrara la caja
   * @return 
   */
  public static boolean mensaje_condicional(String mensage){
    boolean respuesta=false;
    JFrame componentePadre = null;
    int confirmado = JOptionPane.showConfirmDialog(
                componentePadre,
                mensage,"Alerta",
                YES_NO_OPTION );

    if (JOptionPane.OK_OPTION == confirmado){
      respuesta = true;
    }else{
      JOptionPane.showMessageDialog(null,"Cancelado por el usuario");
    }
        
    return respuesta;
  }
  
  /**
   * Mensage con entrada de texto, si se cancela retorna un null
   * si se acepta con campo de texto vacio retorna una cadena de 
   * tamaño 0.
   * @param mensage Texto que se Ingresa
   * @return Cadena de texto 
   */
  public static String mensage_entrada(String mensage){
    return JOptionPane.showInputDialog(mensage);
  }
  
    
}
