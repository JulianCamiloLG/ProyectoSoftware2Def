/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraEstudiante;

import Conexión.conexion;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class controladoraPublicarInquietud
{
    private JdbcTemplate jdbcTemplate;

    public controladoraPublicarInquietud()
    {
        conexion conexionBD = new conexion();
        this.jdbcTemplate = new JdbcTemplate(conexionBD.conectar());
    }
    
    
}
