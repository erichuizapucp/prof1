package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Repositorios.ProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Primary
public abstract class DecoradorListadoProductos implements ListadoProductos {
    @Autowired
    @Qualifier("listado")
    private ListadoProductos listadoProductos;

    @Autowired
    protected ProductosRepo productosRepo;

    @Override
    public Map<String, Object> obtenerListado() {
        return listadoProductos.obtenerListado();
    }
}