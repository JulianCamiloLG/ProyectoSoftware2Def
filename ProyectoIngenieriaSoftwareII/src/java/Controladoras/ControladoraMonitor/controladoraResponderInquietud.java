/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.Entidades.Estudiante;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class controladoraResponderInquietud
{
    private JdbcTemplate jdbcTemplate;

   

    @RequestMapping(value = "responderInquietud.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("responderInquietud");
        mav.addObject("usuarios", new Estudiante());
        return mav;
    }
    
    
    
}
