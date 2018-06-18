package com.prosports.prof1.Patrones.Composite;

import com.prosports.prof1.Entidades.Merchandising;

import java.util.ArrayList;
import java.util.List;

public class ComponenteGrupoDeProductos extends Componente {
    protected List<Componente> items = new ArrayList<>();

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        for (Componente componente : items) {
            sb.append(componente.mostrar());
        }
        return sb.toString();
    }

    @Override
    public void agregar(Componente componente, Object modelo) {
        componente.setViewResolver(viewResolver);
        componente.setModelo(modelo);
        items.add(componente);
    }
}
