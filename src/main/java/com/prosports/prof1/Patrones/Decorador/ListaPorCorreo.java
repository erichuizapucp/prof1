package com.prosports.prof1.Patrones.Decorador;

import java.util.Dictionary;

public class ListaPorCorreo extends DecoradorListadoProductos {
    public ListaPorCorreo(ListadoProductos listadoProductos) {
        super(listadoProductos);
    }

    @Override
    public Dictionary<String, Object> obtenerListado() {
        Dictionary<String, Object> list = super.obtenerListado();

        Object listaPorCorreo = generarListaPorCorreo();
        list.put(TipoListado.CORREO, listaPorCorreo);

        return list;
    }

    public Object generarListaPorCorreo() {
        return null;
    }
}