/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraEstudiante;

import Conexión.conexion;
import Modelos.Entidades.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class controladoraPublicarInquietud
{
    private JdbcTemplate jdbcTemplate;
    private Inquietud inquietud;

    public controladoraPublicarInquietud()
    {
        conexion conexionBD = new conexion();
        this.jdbcTemplate = new JdbcTemplate(conexionBD.conectar());
        this.inquietud = new Inquietud();
    }
    
    @RequestMapping("inquietud.htm")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }
    
    @RequestMapping(value = "publicarInquietud.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("publicarInquietud");
        mav.addObject("inquietud", new Inquietud());
        return mav;
    }
}
