/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Inquietud;
import java.util.LinkedList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author JulianCamilo
 */
public class CRUDInquietud {
    
    private conexion conectar;
    private String sql;
    private JdbcTemplate jdbcTemplate;

    public CRUDInquietud() {
        this.conectar= new conexion();
        this.jdbcTemplate= new JdbcTemplate(conectar.conectar());
        this.sql= "";
    }
    
    
    public List<Inquietud> consultar(int idInquietud){
        this.sql="select * from inquietud where idquietud=" + idInquietud;
        List resultados=this.jdbcTemplate.queryForList(sql);
        return resultados;
    }
    
    
    
    
    
    
}
