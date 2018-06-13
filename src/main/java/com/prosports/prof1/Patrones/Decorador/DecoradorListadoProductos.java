package com.prosports.prof1.Patrones.Decorador;

import java.util.Dictionary;

public abstract class DecoradorListadoProductos implements ListadoProductos {
    protected ListadoProductos listadoProductos;

    public DecoradorListadoProductos(ListadoProductos listadoProductos) {
        this.listadoProductos = listadoProductos;
    }

    @Override
    public Dictionary<String, Object> obtenerListado() {
        return listadoProductos.obtenerListado();
    }
}