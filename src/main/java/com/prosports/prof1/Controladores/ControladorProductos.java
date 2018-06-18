package com.prosports.prof1.Controladores;

import com.prosports.prof1.Entidades.Merchandising;
import com.prosports.prof1.Patrones.Decorador.*;
import com.prosports.prof1.Patrones.Strategy.EstrategiaReportes;
import com.prosports.prof1.Patrones.Strategy.ServicioReportes;
import com.prosports.prof1.Repositorios.ProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorProductos {

    @Autowired
    protected ProductosRepo productosRepo;
    @Autowired
    protected ServicioReportes reportes;

    //  Decoradores concretos
    @Autowired
    @Qualifier("listadoCorreo")
    protected ListadoProductos listaCorreo;
    @Autowired
    @Qualifier("listadoExcel")
    protected ListadoProductos listaExcel;

    // Estrategias concretas
    @Autowired
    @Qualifier("reporteExcel")
    protected EstrategiaReportes reporteExcel;
    @Autowired
    @Qualifier("reporteCorreo")
    protected EstrategiaReportes reporteCorreo;

    @RequestMapping("/")
    public ModelAndView obtenerTodosLosProductos() {
        List<Merchandising> merchandising = new ArrayList<>();
        productosRepo.findAll().forEach(merchandising :: add);

        ModelAndView model = new ModelAndView("productos");
        model.addObject("productos", merchandising);

        return model;
    }

    @RequestMapping(value = "/reporte", produces = { "application/vnd.ms-excel", "text/html" })
    public @ResponseBody ModelAndView obtenerReporte(@RequestParam(value = "opcion", required = false) String option) {
        if (option.equals(TipoListado.EXCEL)) {
            return reportes.procesarReporte(reporteExcel, listaExcel.obtenerListado());
        }
        else {
            return reportes.procesarReporte(reporteCorreo, listaCorreo.obtenerListado());
        }
    }
}