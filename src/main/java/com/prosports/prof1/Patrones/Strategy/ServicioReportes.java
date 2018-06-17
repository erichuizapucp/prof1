package com.prosports.prof1.Patrones.Strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServicioReportes {
    public void procesarReporte(EstrategiaReportes estrategiaReportes, Map<String, Object> datosReporte) {
        estrategiaReportes.procesarReporte(datosReporte);
    }
}