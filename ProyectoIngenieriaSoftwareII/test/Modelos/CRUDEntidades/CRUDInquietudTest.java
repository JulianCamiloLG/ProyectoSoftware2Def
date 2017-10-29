/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Modelos.Entidades.Inquietud;
import java.text.ParseException;
import java.util.List;
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
public class CRUDInquietudTest {
    
    public CRUDInquietudTest() {
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
     * Test of IngresarInquietud method, of class CRUDInquietud.
     */
    @Test
    public void testIngresarInquietud() throws ParseException {
        System.out.println("IngresarInquietud");
        int codigoestudiante = 1234;
        int codigoasignatura =3214;
        String tema = "direccionamiento";
        String descrip = "no entiendo ipv6";
        String date = "18-05-2006";
        CRUDInquietud instance = new CRUDInquietud();
        int expResult = 1;
        int result = instance.IngresarInquietud(codigoestudiante, codigoasignatura, tema, descrip, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of consultaruna method, of class CRUDInquietud.
     */
    @Test
    public void testConsultarunaFallido() {
        System.out.println("consultaruna");
        int idInquietud = 12;
        CRUDInquietud instance = new CRUDInquietud();
        Inquietud expResult = null;
        Inquietud result = instance.consultaruna(idInquietud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarTodas method, of class CRUDInquietud.
     */
    @Ignore
    public void testConsultarTodas() {
        System.out.println("consultarTodas");
        CRUDInquietud instance = new CRUDInquietud();
        List expResult = null;
        List result = instance.consultarTodas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarInquietud method, of class CRUDInquietud.
     */
    @Ignore
    public void testEditarInquietud() throws ParseException {
        System.out.println("editarInquietud");
        int idinquietud = 0;
        int codigoestudiante = 0;
        int codigoasignatura = 0;
        String tema = "";
        String descrip = "";
        String date = "";
        CRUDInquietud instance = new CRUDInquietud();
        int expResult = 1;
        int result = instance.editarInquietud(idinquietud, codigoestudiante, codigoasignatura, tema, descrip, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarinquietud method, of class CRUDInquietud.
     */
    @Test
    public void testEliminarinquietud() {
        System.out.println("eliminarinquietud");
        int idinquietud = 10;
        CRUDInquietud instance = new CRUDInquietud();
        int expResult = 1;
        int result = instance.eliminarinquietud(idinquietud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
