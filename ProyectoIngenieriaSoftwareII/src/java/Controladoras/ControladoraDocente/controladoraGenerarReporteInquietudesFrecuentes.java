/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraDocente;

import Modelos.Entidades.RespuestaInquietud;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergioandres
 */
@Controller
public class controladoraGenerarReporteInquietudesFrecuentes {
    @RequestMapping(value = "generarReporteInquietudesFrecuentes.htm", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        System.out.println("Llego a control");
//        String fechaRespuesta = request.getParameter("fechaRespuesta");
//        String horaRespuesta = request.getParameter("horaInicioRespuesta");
//        System.out.println("esto tiene fecha: "+fechaRespuesta);
//        System.out.println("esto tiene hora: "+horaRespuesta);
        mav.setViewName("generarReporteInquietudesFrecuentes");
        mav.addObject("respuestas", new RespuestaInquietud());
        return mav;
    }
    
}
