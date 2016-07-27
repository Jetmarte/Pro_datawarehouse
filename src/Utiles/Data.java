/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author omar
 */
public class Data {
  
  //**********************************************************************
  /**
   * Separa una cadena cuando encuentra un caracter espesifico
   * @param fila String es la cadena a fragmentar
   * @param separador char   es el caracter que divide la cadena
   * @return 
   */
  public static ArrayList separarChar(String fila, char separador){
    ArrayList <String> lista = new ArrayList();
    //cadena auxiliar 
    String cadena = "";
    
    for(int i=0 ; i<fila.length() ; i++){
      if(fila.charAt(i) == separador ){
        //guardar en lista 
        lista.add(cadena);
        
        //limpiar cadena
        cadena = "";
        
      }else{
        
        //agregar caracter a la cadena
        cadena = cadena + fila.charAt(i);
        
        //para guardar la ultima cadena
        if(fila.length()-1 == i){
          lista.add(cadena);
          cadena = "";
        }
      }
    }
    return lista;
  }
  
  //**********************************************************************
  
  /**
   * 
   * @param fila
   * @param sepApertura
   * @param sepCierre
   * @return 
   */
  public static ArrayList separarCharEtiquetas(
      String fila, 
      char sepApertura, 
      char sepCierre){
    
    //declaramos la lista
    ArrayList <String> lista = new ArrayList();
    
    //cadena auxiliar
    String cadena = "";
    
    boolean subcadena= false;
    for(int i=0 ; i<fila.length() ; i++){
      
      if(fila.charAt(i) == sepApertura ){
        i++;
        subcadena = true;
      }else if(fila.charAt(i) == sepCierre){
        subcadena = false;
      }
      
      if(subcadena == true){
        cadena = cadena + fila.charAt(i);
      }else{
        lista.add(cadena);
        cadena = "";
      }
    
    }
    
    return lista;
  }
  
  //**********************************************************************
  //obtener tamano de la lista
  public static int tamanoArrayList(ArrayList lista){
    return lista.size();
  }
  
  //**********************************************************************
  /**
   * 
   * @param lista
   * @param separador
   * @return 
   */
  public static Object[][] arrayDatos (ArrayList lista, char separador){
    Object[][] miarray; //declarando array
    
    //numero de filas
    int filas;
    try{
      filas = lista.size();
    
      //numero de columnas
      int columnas;
      columnas = maxTamanoColumnas(lista, separador);
      //instanciar array
      System.out.println("tamaño fila "+ filas);
      System.out.println("tamaño columnas "+ columnas);

      miarray = new Object[filas][columnas];

      int i = 0;
      int j = 0;

      Iterator it_fila = lista.iterator();
      String celda;
      while(it_fila.hasNext()){
        Iterator it_celda = separarChar((String) it_fila.next(), separador).iterator();

        while(it_celda.hasNext()){

           celda = (String)it_celda.next();
           if(celda == null){
             celda = " ";
           }

          miarray[j][i] = celda;
          i++;
        }
        i = 0;
        j++;
      }
      
    }catch(NullPointerException ex ){
      System.out.println("lista es null");
      Object[][] o = {{""},{""}};
      miarray = o;
    }
    
    
    return miarray;
  }
  
  //**********************************************************************
  /**
   * 
   * @param lista
   * @param separador
   * @return 
   */
  public static int maxTamanoColumnas(ArrayList lista, char separador){
    int tamano = 0; //tamano del array mas grande
    int aux = 0;  //variable auxiliar
    Iterator it = lista.iterator();
    
    while(it.hasNext()){
      aux = separarChar((String)it.next(), separador).size();
      if(aux > tamano){
        tamano = aux;
      }
    }
    return tamano;
  }
  
    
}
