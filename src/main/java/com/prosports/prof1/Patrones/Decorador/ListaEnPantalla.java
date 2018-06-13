package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Entidades.Merchandising;

import java.util.Dictionary;
import java.util.List;

public class ListaEnPantalla extends DecoradorListadoProductos {
    public ListaEnPantalla(ListadoProductos listadoProductos) {
        super(listadoProductos);
    }

    @Override
    public Dictionary<String, Object> obtenerListado() {
        Dictionary<String, Object> list = super.obtenerListado();

        List<Merchandising> listaEnPantalla = generarListaEnPantalla();
        list.put(TipoListado.PANTALLA, listaEnPantalla);

        return list;
    }

    public List<Merchandising> generarListaEnPantalla() {
        return null;
    }
}