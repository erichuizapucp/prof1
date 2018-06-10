package com.prosports.prof1.Controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prosports.prof1.Repositorios.AficionadosRepo;

@Controller
public class ControladorAficionados {

    @Autowired
    protected AficionadosRepo aficionadosRepo;

    @RequestMapping(value="/login")
    public ModelAndView obtenerLogin(HttpServletRequest request, HttpServletResponse response) {
    	
    	ModelAndView model = new ModelAndView("login");
    	return model;
    }
    
    @RequestMapping(value="/crear")
    public ModelAndView crearCuenta(HttpServletRequest request, HttpServletResponse response) {
    	
    	ModelAndView model = new ModelAndView("crearAficionado");
    	return model;
    }
    
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(Map<String, Object> model) {
//        UserForm loginUser = new UserForm();
//        model.put("userForm", loginUser);

//        return "Login";
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String doLogin(
//            @Valid @ModelAttribute("userForm") UserForm userForm,
//            BindingResult result, 
//            Map<String, Object> model) {
//
//        if (result.hasErrors()) {
//            return "Login";
//        }
//
//        return "Home";
//    }
}
