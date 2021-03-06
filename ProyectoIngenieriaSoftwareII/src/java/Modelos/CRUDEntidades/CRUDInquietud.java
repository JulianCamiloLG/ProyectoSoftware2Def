/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Inquietud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

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
    
    public int IngresarInquietud(int codigoestudiante, String codigoasignatura,String tema, String descrip, String date) throws ParseException{
        Inquietud nuevainquietud = new Inquietud(0,codigoestudiante,codigoasignatura,tema,descrip,date);
        this.sql="insert into inquietud(idinquietud,codigoestudiante,codigoasignatura,tema,descripcion,fechapublicacion) values (0,"+nuevainquietud.getCodigoEstudiante()+","+nuevainquietud.getCodigoidAsignatura()+","+nuevainquietud.getTema()+","+nuevainquietud.getDescripcion()+","+nuevainquietud.getFechaPublicacion()+");";
        int resul=this.jdbcTemplate.update(sql);
        return resul;
    }
    
    
    public Inquietud consultaruna(int idInquietud){
        this.sql="select * from inquietud where idinquietud=" + idInquietud+";";
        return (Inquietud) this.jdbcTemplate.query(sql, new ResultSetExtractor<Inquietud>() {
            @Override
            public Inquietud extractData(ResultSet rs) throws SQLException, DataAccessException {
                    if(rs.next()){
                        Inquietud aux = new Inquietud();
                        aux.setIdInquietud(rs.getInt(1));
                        aux.setCodigoEstudiante(rs.getInt(2));
                        aux.setCodigoidAsignatura(rs.getString(3));
                        aux.setTema(rs.getString(4));
                        aux.setDescripcion(rs.getString(5));
                        aux.setFechaPublicacion(rs.getString(6));
                        return aux;
                    }
                    return null;
                }
        });
    }
    
    public List consultarTodas(){
        this.sql = "select * from inquietud order by idinquietud desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
    
    
    public int editarInquietud(int idinquietud,int codigoestudiante, String codigoasignatura,String tema, String descrip, String date) throws ParseException{
        Inquietud nuevainquietud = new Inquietud(10,codigoestudiante,codigoasignatura,tema,descrip,date);
        this.sql="update inquietud set codigoestudiante="+nuevainquietud.getCodigoEstudiante()+",codigoasignatura="+nuevainquietud.getCodigoidAsignatura()
                +",tema="+nuevainquietud.getTema()+",descripcion="+nuevainquietud.getDescripcion()+",fechapublicacion="+nuevainquietud.getFechaPublicacion()
                +"where idinquietud="+idinquietud+";";
        int result = this.jdbcTemplate.update(sql);
        return result;
    }
    
    public int eliminarinquietud(int idinquietud){
        this.sql="delete from inquietud where idinquietud="+idinquietud+";";
        int result = this.jdbcTemplate.update(sql);
        return result;         
    }
    
    public List reporteInquietudesFrecuentes(){
        this.sql = "select codigoasignatura,tema,descripcion,fechaPublicacion from inquietud;";
        List<Inquietud> datos = this.jdbcTemplate.query(sql, new RowMapper<Inquietud>() {
            @Override
            public Inquietud mapRow(ResultSet rs, int i) throws SQLException {
                //To change body of generated methods, choose Tools | Templates.
                Inquietud nueva = new Inquietud();
                nueva.setCodigoidAsignatura(rs.getString("codigoasignatura"));
                nueva.setTema(rs.getString("tema"));
                nueva.setDescripcion(rs.getString("descripcion"));
                nueva.setFechaPublicacion(rs.getDate("fechaPublicacion").toString());
                return nueva;
            }
        });
        
        return datos;
    }
                
    
    
    
}
