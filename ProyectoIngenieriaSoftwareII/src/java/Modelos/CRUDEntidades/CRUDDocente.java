/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Docente;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author sergioandres
 */
public class CRUDDocente {
    private JdbcTemplate jdbcTemplate;
    private String sql;

    public CRUDDocente() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate (con.conectar());     
    }
    
    /**
     * funcion para registrar un nuevo docente en la base de datos
     * @param d Modelo de docente que se desea registrar
     * @return 
     */
    public int registrarDocente(Docente d){
        return jdbcTemplate.update("INSERT INTO docente (identificacion,nombre,apellido,correoElectronico)"
        + "VALUES (?,?,?,?)",d.getIdentificacion(),d.getNombre(),d.getApellido(),d.getCorreoElectronico());
    }
    
    /**
     * funcion para eliminar un docente de la base de datos del sistema
     * @param identificacion  identificador del docente que se desea eliminar
     * @return 
     */
    public int eliminarDocente(int identificacion){
        return jdbcTemplate.update("DELETE from docente "
                + "WHERE "
                + "identificacion=?;",identificacion);
    }
    
    /**
     * funcion para editar un docente dada su identificacion
     * @param d Objeto con los nuevos datos del docente
     * @param identificacion  Identificador del docente que se desea editar
     * @return 
     */
    public int editarDocente(Docente d, String identificacion){
        return jdbcTemplate.update("UPDATE docente"
                + "nombre=?,"
                + "apellido=?"
                + "correoElectronico=?,"
                + "WHERE identificacion=?",d.getNombre(),d.getApellido(),d.getCorreoElectronico(),identificacion);
    }
    
    /**
     * funcion para consultar en la base de datos una pregunta
     * @param idPregunta idetificador de la pregunta que se desea consultar
     * @return una pregunta con todos sus valores
     */
    public Pregunta seleccionarPregunta(int idPregunta) {
        final Pregunta pre = new Pregunta();
        String quer = "SELECT * FROM pregunta WHERE idPregunta=?" + idPregunta;
        return (Pregunta) jdbcTemplate.query(quer, (ResultSet rs) -> {
            if (rs.next()) {
                pre.setEnunciado(rs.getString("enunciado"));
                pre.setRutaImagen((rs.getString("rutaImagen")));
            }
            return pre;
        });
    }
    
    /**
     * funcion para buscar todas las preguntas que hay en la base de datos
     * @return lista total de preguntas
     */
    public List consultarTodas(){
        this.sql = "select * from preguntas order by idpregunta desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
    
    /**
     * funcion para buscar 10 preguntas de manera aleatoria en la base de datos
     * @return preguntas aleatorias
     */
    public List consultarAleatorio(){
        this.sql = "SELECT * FROM preguntas ORDER BY RAND() LIMIT 10";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
    
    
}
