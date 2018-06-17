package com.prosports.prof1.Patrones.Strategy;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("reporteCorreo")
public class ReportePorCorreo implements EstrategiaReportes {
    @Override
    public void procesarReporte(Map<String, Object> datosReporte) {

    }
}
