package com.prosports.prof1.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.prosports.prof1.Entidades.Aficionado;
import com.prosports.prof1.Entidades.Usuario;

public interface AficionadosRepo extends CrudRepository<Aficionado, Integer> {

}