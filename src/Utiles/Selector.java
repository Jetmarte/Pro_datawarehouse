/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author omar
 */
public class Selector {
  
  private JFileChooser buscador;
  
  /**
   * Elegir un archivo con un file choser
   * Si se cancela retorna un tipo null
   * @return  String Direccion del archivo en el disco
   */
  public String selectorArchivo (String nombre, String extencion, String tipo){
    String nombre_archivo = null;
    
    //instanciamos jfilechoser
    this.buscador = new JFileChooser();
    
    
    //filtrar extenciones de archivos solo txt
    FileNameExtensionFilter filter;
    if(nombre.equals("") && extencion .equals("") && tipo.equals("")){
      filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
    }else{
      filter = new FileNameExtensionFilter(nombre, extencion, tipo);
    }
    
    
    
    //asignar el filtro al file chooser
    this.buscador.setFileFilter(filter);
    
    //pagina por defecto la raiz
    this.buscador.setCurrentDirectory(new java.io.File("."));
    
    //Titulo que llevara la ventana
    this.buscador.setDialogTitle("Elegir un archivo.");
    
    //Elegiremos archivos del directorio
    this.buscador.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    
    this.buscador.setAcceptAllFileFilterUsed(true);
    
    
    //Si seleccionamos algún archivo retornaremos su directorio
    if (this.buscador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      nombre_archivo = this.buscador.getSelectedFile().toString();
      
      
    } else {
      
      //mensaje de error archivo no elegido
      Mensaje.mensaje_simple("No se eligio ningun archivo");
    }
    
    return nombre_archivo;
  }
  
  
}
