/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Modelos.Entidades.Asignatura;
import Modelos.Entidades.Pregunta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author JulianCamilo
 */
public class CRUDPreguntaTest {
    
    public CRUDPreguntaTest() {
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
     * Test of registrarPregunta method, of class CRUDPregunta.
     * Se desea comprobar una correcta insercion de una pregunta
     * en el sistema
     */
    @Test
    public void testRegistrarPreguntaCorrectamente() {
        System.out.println("registrarPregunta");
        Pregunta p = new Pregunta(0, "enunciado prueba", "C:/Descktop");
        Asignatura a = new Asignatura("12345", "asignaturaPrueba", 3);
        CRUDPregunta instance = new CRUDPregunta();
        int expResult = 1;
        int result = instance.registrarPregunta(p, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPregunta method, of class CRUDPregunta.
     * Se desea probar que el sistema repsonde correctamente ante
     * un borrado indebido
     */
    @Test
    public void testEliminarPreguntaFallido() {
        System.out.println("eliminarPregunta");
        int idPregunta = 0;
        CRUDPregunta instance = new CRUDPregunta();
        int expResult = 0;
        int result = instance.eliminarPregunta(idPregunta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editarPregunta method, of class CRUDPregunta.
     */
    @Ignore
    public void testEditarPregunta() {
        System.out.println("editarPregunta");
        Pregunta p = null;
        Asignatura a = null;
        int idPregunta = 0;
        CRUDPregunta instance = new CRUDPregunta();
        int expResult = 0;
        int result = instance.editarPregunta(p, a, idPregunta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    /**
     * Test of seleccionarPregunta method, of class CRUDPregunta.
     */
    @Test
    public void testSeleccionarPreguntaFallido() {
        System.out.println("seleccionarPregunta");
        int idPregunta = 5;
        CRUDPregunta instance = new CRUDPregunta();
        Pregunta expResult = null;
        Pregunta result = instance.seleccionarPregunta(idPregunta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
