/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.receta.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enfermera {
    
    @Id
    private Integer idEnfermera;
    
    private String nombre;
    private String apellido;
    private String matricula;

    public Integer getIdEnfermera() {
        return idEnfermera;
    }

    public void setIdEnfermera(Integer idEnfermera) {
        this.idEnfermera = idEnfermera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
