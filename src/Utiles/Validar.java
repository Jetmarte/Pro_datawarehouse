/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

/**
 *
 * @author jetmarte
 */
public class Validar {
  
  /**
   * Elimina los espacios de una cadena
   * @param cadena String cadena a la que se eliminaran los espacions.
   * @return  String , cadena sin espacios
   */
  public static String quitarEspacios( String cadena){
    String cadenaSinEspacios;
    try{
      cadenaSinEspacios = cadena.replace(" ", "");
    }catch(NullPointerException ex){
      System.out.println("Error tipo: " + ex);
      cadenaSinEspacios = "";
    }
    
    return cadenaSinEspacios;
    
  }
  
}

