package com.prosports.prof1.Patrones.Composite;

import org.springframework.web.servlet.ViewResolver;

public abstract class Componente {
    protected ViewResolver viewResolver;
    protected Object modelo;

    public abstract String mostrar();
    public abstract void agregar(Componente componente, Object modelo);

    public void setViewResolver(ViewResolver viewResolver) {
        this.viewResolver = viewResolver;
    }

    public void setModelo(Object modelo) {
        this.modelo = modelo;
    }
}
