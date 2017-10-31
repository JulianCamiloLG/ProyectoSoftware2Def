/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesDocenteAdmin;

import Modelos.CRUDEntidades.*;
import Modelos.Entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class OperacionesGestionarEvaluacionesParaMonitor
{
    
    public int ingresarPregunta(Pregunta p, Asignatura a)
    {
        CRUDPregunta crudPregunta = new CRUDPregunta();
        int result = crudPregunta.registrarPregunta(p, a);
        return result;
    }
    
    public int ingresarRespuesta(Respuesta r, Pregunta p)
    {
        CRUDRespuesta crudRespuesta = new CRUDRespuesta();
        int result = crudRespuesta.registrarRespuesta(r, p);
        return result;
    }
    
    public int eliminarPregunta(int idPregunta)
    {
        CRUDPregunta crudPregunta = new CRUDPregunta();
        int result = crudPregunta.eliminarPregunta(idPregunta);
        return result;
    }
    
    public int eliminarRespuesta(int idRespuesta)
    {
        CRUDRespuesta crudRespuesta = new CRUDRespuesta();
        int result = crudRespuesta.eliminarRespuesta(idRespuesta);
        return result;
    }
    
    
    
    
    
    
    
}
