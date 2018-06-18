package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Entidades.Merchandising;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.stereotype.Component;

import java.io.StringWriter;
import java.util.List;
import java.util.Map;

@Component("listadoCorreo")
public class ListaPorCorreo extends DecoradorListadoProductos {
    @Override
    public Map<String, Object> obtenerListado() {
        Map<String, Object> list = super.obtenerListado();

        Object listaPorCorreo = generarListaPorCorreo(list);
        list.put(TipoListado.CORREO, listaPorCorreo);

        return list;
    }

    public Object generarListaPorCorreo(Map<String, Object> list) {
        VelocityEngine engine = new VelocityEngine();
        engine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        engine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        engine.init();

        Template template = engine.getTemplate("templates/email.vm");

        List<Merchandising> productos = (List<Merchandising>)list.get(TipoListado.SIMPLE);

        VelocityContext context = new VelocityContext();
        context.put("productos", productos);

        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        return writer.getBuffer().toString();
    }
}