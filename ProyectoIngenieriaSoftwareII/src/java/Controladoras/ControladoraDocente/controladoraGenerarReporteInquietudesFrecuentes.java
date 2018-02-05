/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraDocente;

import Modelos.Entidades.Inquietud;
import Modelos.Entidades.RespuestaInquietud;
import Modelos.CRUDEntidades.CRUDInquietud;
import java.util.LinkedList;
import java.util.List;
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
    private CRUDInquietud crudInq;
    
    @RequestMapping(value = "generarReporteInquietudesFrecuentes.htm", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        LinkedList<String> uno = new LinkedList<>();
        LinkedList<LinkedList> dos= new LinkedList<>();
        uno.add("1");
        uno.add("lenguajes");
        uno.add("Lexico");
        uno.add("duro");
        uno.add("nulo");
        dos.add(uno);
//        List<Inquietud> datos = this.crudInq.reporteInquietudesFrecuentes();
        mav.addObject("inquietudesFrecuentes", dos);
        mav.setViewName("generarReporteInquietudesFrecuentes");
        return mav;
    }
    
}
