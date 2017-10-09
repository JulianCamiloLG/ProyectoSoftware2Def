/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class Inquietud
{
    private int idInquietud;
    private int codigoEstudiante;
    private int codigoidAsignatura;
    private String tema;
    private String Descripcion;
    private String fechaPublicacion;

    public Inquietud()
    {
    }

    public Inquietud(int idInquietud, int codigoEstudiante, int codigoidAsignatura, String tema, String Descripcion, String fechaPublicacion)
    {
        this.idInquietud = idInquietud;
        this.codigoEstudiante = codigoEstudiante;
        this.codigoidAsignatura = codigoidAsignatura;
        this.tema = tema;
        this.Descripcion = Descripcion;
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * @return the idInquietud
     */
    public int getIdInquietud()
    {
        return idInquietud;
    }

    /**
     * @param idInquietud the idInquietud to set
     */
    public void setIdInquietud(int idInquietud)
    {
        this.idInquietud = idInquietud;
    }

    /**
     * @return the codigoEstudiante
     */
    public int getCodigoEstudiante()
    {
        return codigoEstudiante;
    }

    /**
     * @param codigoEstudiante the codigoEstudiante to set
     */
    public void setCodigoEstudiante(int codigoEstudiante)
    {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * @return the codigoidAsignatura
     */
    public int getCodigoidAsignatura()
    {
        return codigoidAsignatura;
    }

    /**
     * @param codigoidAsignatura the codigoidAsignatura to set
     */
    public void setCodigoidAsignatura(int codigoidAsignatura)
    {
        this.codigoidAsignatura = codigoidAsignatura;
    }

    /**
     * @return the tema
     */
    public String getTema()
    {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema)
    {
        this.tema = tema;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion()
    {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the fechaPublicacion
     */
    public String getFechaPublicacion()
    {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(String fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    
}