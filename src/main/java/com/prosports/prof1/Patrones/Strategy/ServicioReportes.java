package com.prosports.prof1.Patrones.Strategy;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Service
public class ServicioReportes {
    public ModelAndView procesarReporte(EstrategiaReportes estrategiaReportes, Map<String, Object> datosReporte) {
        return estrategiaReportes.procesarReporte(datosReporte);
    }
}