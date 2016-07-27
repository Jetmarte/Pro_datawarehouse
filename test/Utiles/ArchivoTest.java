/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jetmarte
 */
public class ArchivoTest {
  
  public ArchivoTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of leerArchivo method, of class Archivo.
   */
  @Test
  public void testLeerArchivo() {
    System.out.println("leerArchivo");
    String archivo = "archivo_uno.csv";
    ArrayList lista = new ArrayList();
    ArrayList expResult = Archivo.leerArchivo(archivo);
    ArrayList result = Archivo.leerArchivo(archivo);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
  }
  
}
