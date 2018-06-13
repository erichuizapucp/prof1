package com.prosports.prof1.Controladores;

import com.prosports.prof1.Entidades.Merchandising;
import com.prosports.prof1.Repositorios.ProductosRepo;
import com.prosports.prof1.Servicios.IReportesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorProductos {

    @Autowired
    protected ProductosRepo productosRepo;

    @Autowired
    protected IReportesService reportesService;

    @RequestMapping("/")
    public ModelAndView obtenerTodosLosProductos(HttpServletRequest request, HttpServletResponse response) {
        List<Merchandising> merchandising = new ArrayList<>();
        productosRepo.findAll().forEach(merchandising :: add);

        ModelAndView model = new ModelAndView("productos");
        model.addObject("productos", merchandising);

        return model;
    }
}
