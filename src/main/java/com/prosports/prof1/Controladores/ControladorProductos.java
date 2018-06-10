package com.prosports.prof1.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ControladorProductos {

    @RequestMapping("/")
    public ModelAndView obtenerTodosLosProductos(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("productos");
        model.addObject("mensaje", "Lista de Productos");

        return model;
    }

}
