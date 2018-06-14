package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Entidades.Merchandising;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

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
        List<Merchandising> productos = new ArrayList<>();
        productosRepo.findAll().forEach(productos :: add);

        VelocityEngine engine = new VelocityEngine();
        engine.init();

        Template template = engine.getTemplate("email.vm");

        VelocityContext context = new VelocityContext();
        context.put("products", productos);

        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        return writer.getBuffer().toString();
    }
}