package com.prosports.prof1.Patrones.Strategy;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("reporteExcel")
public class ReporteEnExcel implements EstrategiaReportes{
    @Override
    public void procesarReporte(Map<String, Object> datosReporte) {

    }
}
