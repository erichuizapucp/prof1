package com.prosports.prof1.Patrones.Composite;

import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ComponenteProducto extends Componente {
    @Override
    public String mostrar() {
        try {
            View resolvedView = viewResolver.resolveViewName("producto", Locale.US);
            MockHttpServletResponse mockResp = new MockHttpServletResponse();

            HttpServletRequest request =
                    ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

            Map<String, Object> mapModelo = new HashMap<>();
            mapModelo.put("producto", this.modelo);

            resolvedView.render(mapModelo, request, mockResp);

            return mockResp.getContentAsString();
        }
        catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
        return null;
    }

    @Override
    public void agregar(Componente componente, Object modelo) {
    }
}
