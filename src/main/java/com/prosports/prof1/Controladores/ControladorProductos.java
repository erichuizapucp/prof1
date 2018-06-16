package com.prosports.prof1.Controladores;

import com.prosports.prof1.Entidades.Merchandising;
import com.prosports.prof1.Patrones.Decorador.*;
import com.prosports.prof1.Repositorios.ProductosRepo;
import com.prosports.prof1.Servicios.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ControladorProductos {

    @Autowired
    protected ProductosRepo productosRepo;

//    @Autowired
//    @Qualifier("listado")
//    protected ListadoProductos listaPantalla;

    @Autowired
    @Qualifier("listadoCorreo")
    protected ListadoProductos listaCorreo;

    @Autowired
    @Qualifier("listadoExcel")
    protected ListadoProductos listaExcel;

    @Autowired
    protected IEmailService emailService;

    @RequestMapping("/")
    public ModelAndView obtenerTodosLosProductos() {
        List<Merchandising> merchandising = new ArrayList<>();
        productosRepo.findAll().forEach(merchandising :: add);

        ModelAndView model = new ModelAndView("productos");
        model.addObject("productos", merchandising);

        return model;
    }

    @RequestMapping("/reporte")
    public ModelAndView obtenerTodosLosProductos(@RequestParam(value = "opcion", required = false) String option) {
        ListadoProductos listado;
        Map<String, Object> datosReporte;

        if (option.equals(TipoListado.EXCEL)) {
            listado = listaExcel;
            datosReporte = listado.obtenerListado();


        }
        else {
            listado = listaCorreo;
            datosReporte = listado.obtenerListado();
        }





        return null;
    }
}
