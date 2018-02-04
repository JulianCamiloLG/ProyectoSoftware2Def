/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.Entidades.Estudiante;
import Modelos.Entidades.RespuestaInquietud;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
@Controller
public class controladoraResponderInquietud
{

    @RequestMapping(value = "responderInquietud.htm", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        String fechaRespuesta = request.getParameter("fechaRespuesta");
        String horaRespuesta = request.getParameter("horaInicioRespuesta");
        System.out.println("esto tiene fecha: "+fechaRespuesta);
        System.out.println("esto tiene hora: "+horaRespuesta);
        mav.setViewName("responderInquietud");
        mav.addObject("respuestas", new RespuestaInquietud());
        return mav;
    }

}
