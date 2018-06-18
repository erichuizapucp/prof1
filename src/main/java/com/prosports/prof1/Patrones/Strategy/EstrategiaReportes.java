package com.prosports.prof1.Patrones.Strategy;

import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public interface EstrategiaReportes {
    ModelAndView procesarReporte(Map<String, Object> datosReporte);
}
