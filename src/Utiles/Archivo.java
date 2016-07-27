/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omar
 */
public class Archivo {
  
  //**********************************************************************
  
  /**
   * leer un archivo de texto
   * @param archivo Nombre y extencion del archivo que deseamos leer, si
   * el archivo no existe retorna null, si el parametro es null retorna null
   * @return ArrayList   lista de cadenas String
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public static ArrayList leerArchivo ( String archivo ) {
    //cadena donde se almacena la linea leida de texto
    String cadena = "";
    
    //ArrayList lista donde se guarda las filas del archivo
    ArrayList <String> lista = new ArrayList();
    
    //comprovar si existe el archivo
    if( fileExist(archivo) ){
      //leer archivo de texto
      FileReader miArchivo = null;
      try {
        miArchivo = new FileReader( archivo );
      } catch (FileNotFoundException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
      }

      try (
      //BufferedReader: lee texto de una entrada de caracteres.
      BufferedReader b = new BufferedReader(miArchivo)){ 

        while( (cadena = b.readLine() ) != null) {
          //agregar a la lista
          lista.add(cadena);
        
        }
      } catch (IOException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
      }
    }else{  //el archivo no existe
      //mensage de error
      Mensaje.mensaje_simple("El archivo no existe");
      
      lista = null; //lista nula 
    }
    
    //retorna el ArrayList
    return lista;
  }
  
  //**********************************************************************
  
  /**
   * Verificar si el archivo existe o no existe
   * 
   * @param archivo Nombre del archivo que se desea abrir
   * @return  boolean  true si el archivo existe y false si el archivo 
   * no existe
   */
  private static boolean fileExist(String archivo){
    boolean existe ;
    //abrir fichero
    try{
      File fichero = new File(archivo);
      existe = fichero.exists();
    }catch(NullPointerException np){
      existe = false;
    }
    
    
    //preguntar si el archivo existe
    return  existe;
  }
  
  
  
}
