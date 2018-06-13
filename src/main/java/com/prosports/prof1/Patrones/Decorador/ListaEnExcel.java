package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Entidades.Merchandising;

import java.util.Dictionary;
import java.util.List;

public class ListaEnExcel extends DecoradorListadoProductos {
    public ListaEnExcel(ListadoProductos listadoProductos) {
        super(listadoProductos);
    }

    @Override
    public Dictionary<String, Object> obtenerListado() {
        Dictionary<String, Object> list = super.obtenerListado();

        Object listaEnExcel = generarListaEnExcel();
        list.put(TipoListado.EXCEL, listaEnExcel);

        return list;
    }

    public Object generarListaEnExcel() {
        return null;
    }
}