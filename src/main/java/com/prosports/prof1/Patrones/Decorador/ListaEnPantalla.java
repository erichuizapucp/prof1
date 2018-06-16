package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Entidades.Merchandising;
import com.prosports.prof1.Repositorios.ProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("listado")
public class ListaEnPantalla implements ListadoProductos {
    @Autowired
    protected ProductosRepo productosRepo;

    @Override
    public Map<String, Object> obtenerListado() {
        Map<String, Object> list = new HashMap<>();

        List<Merchandising> listaEnPantalla = generarListaEnPantalla();
        list.put(TipoListado.PANTALLA, listaEnPantalla);

        return list;
    }

    public List<Merchandising> generarListaEnPantalla() {
        List<Merchandising> productos = new ArrayList<>();
        productosRepo.findAll().forEach(productos :: add);

        return productos;
    }
}