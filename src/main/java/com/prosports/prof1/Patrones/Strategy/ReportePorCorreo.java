package com.prosports.prof1.Patrones.Strategy;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Component("reporteCorreo")
public class ReportePorCorreo implements EstrategiaReportes {
    @Override
    public ModelAndView procesarReporte(Map<String, Object> datosReporte) {
        // Incluir código para envio de correo

        return new ModelAndView("correo", datosReporte);
    }
}
