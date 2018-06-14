package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Repositorios.ProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Dictionary;

public abstract class DecoradorListadoProductos implements ListadoProductos {
    protected ListadoProductos listadoProductos;

    @Autowired
    protected ProductosRepo productosRepo;

    public DecoradorListadoProductos(ListadoProductos listadoProductos) {
        this.listadoProductos = listadoProductos;
    }

    @Override
    public Dictionary<String, Object> obtenerListado() {
        return listadoProductos.obtenerListado();
    }
}