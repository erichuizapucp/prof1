package com.prosports.prof1.Patrones.Strategy;

import com.prosports.prof1.Views.ExcelView;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Component("reporteExcel")
public class ReporteEnExcel implements EstrategiaReportes{
    @Override
    public ModelAndView procesarReporte(Map<String, Object> datosReporte) {
        return new ModelAndView(new ExcelView(), datosReporte);
    }
}
