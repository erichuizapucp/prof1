package com.prosports.prof1.Controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prosports.prof1.Entidades.Aficionado;
import com.prosports.prof1.Entidades.Usuario;
import com.prosports.prof1.Repositorios.AficionadosRepo;

@Controller
public class ControladorAficionados {

    @Autowired
    protected AficionadosRepo aficionadosRepo;

    @RequestMapping(value="/login")
    public ModelAndView obtenerLogin(HttpServletRequest request, HttpServletResponse response,Model model) {
        
    	model.addAttribute("correoElectronico", ""); 
    	model.addAttribute("contrasena", ""); 
    	
    	ModelAndView modelView = new ModelAndView("login");
    	return modelView;
    }
    
    @RequestMapping(value="/crear")
    public ModelAndView obtegerCrearCuenta(HttpServletRequest request, HttpServletResponse response,Model model) {
    	model.addAttribute("nombre", ""); 
    	model.addAttribute("apellidoPaterno", ""); 
    	model.addAttribute("apellidoMaterno", ""); 
    	model.addAttribute("edad", 0); 
    	model.addAttribute("sexo", ""); 
    	model.addAttribute("correoElectronico", ""); 
    	model.addAttribute("contrasena", ""); 
    	ModelAndView modelView = new ModelAndView("crearAficionado");
    	return modelView;
    }
    
    
    @RequestMapping(value="/crear",method=RequestMethod.POST)
    public ModelAndView crearCuenta(@ModelAttribute("user")Aficionado usuario,BindingResult bindingResult) {
		ModelAndView modelView = new ModelAndView();

    	try {
    		System.out.println("getNombre-->>>>>"+usuario.getNombre()+"");
        	System.out.println("getApellidoPaterno-->>>>>"+usuario.getApellidoPaterno()+"");
        	System.out.println("getApellidoMaterno-->>>>>"+usuario.getApellidoMaterno()+"");
        	System.out.println("getEdad-->>>>>"+usuario.getEdad()+"");
        	System.out.println("getSexo-->>>>>"+usuario.getSexo()+"");
        	System.out.println("getCorreoElectronico-->>>>>"+usuario.getCorreoElectronico()+"");
        	System.out.println("getContrasena-->>>>>"+usuario.getContrasena()+"");

        	modelView = new ModelAndView("redirect:/login");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return modelView;
    }
    
    @RequestMapping(value = "/login",method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("user")Aficionado usuario,BindingResult bindingResult) {
		ModelAndView model = new ModelAndView();

    	try {
        	System.out.println("getCorreoElectronico-->>>>>"+usuario.getCorreoElectronico()+"");
        	System.out.println("getContrasena-->>>>>"+usuario.getContrasena()+"");

        	model = new ModelAndView("redirect:/");
		} catch (Exception e) {
			e.printStackTrace();
		}

    	return model;
    }
}