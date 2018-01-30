/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import java.util.LinkedList;
import Modelos.Entidades.*;
import java.util.List;
/**
 *
 * @author sergioandres
 */
public class OperacionesEstudianteMonitor {
 
    LinkedList<Estudiante> monitores = new LinkedList<>();
    
    public LinkedList<Estudiante> obtenerMonitores(List<Estudiante> totalEstudiantes)
    {
        for (Estudiante estudianteIterador:totalEstudiantes)
        {
            if (estudianteIterador.getMonitor()!=0)
            {
                this.monitores.add(estudianteIterador);
            }
        }
        return monitores;
    }
}
