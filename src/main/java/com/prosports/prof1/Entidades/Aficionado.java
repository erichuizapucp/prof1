package com.prosports.prof1.Entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Aficionado extends Usuario {
    @Column(nullable = false)
    private int edad;
    @Column(nullable = false)
    private String sexo;

    public Aficionado(int codigo,
                      String nombre,
                      String apellidoPaterno,
                      String apellidoMaterno,
                      String correoElectronico,
                      String contrasena,
                      int edad,
                      String sexo) {
        super(codigo, nombre, apellidoPaterno, apellidoMaterno, correoElectronico, contrasena);

        this.edad = edad;
        this.sexo = sexo;
    }
}

//sobrescribir update save para usar strategy

//objeto strategy
//
//ca128 bits
//algoritmos de encriptacion de dsatos