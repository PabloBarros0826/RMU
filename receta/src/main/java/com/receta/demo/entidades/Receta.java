/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.receta.demo.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receta {
    
    @Id
    Integer idReceta;
    
    private String diagnostico;
    private String dosis;
    private Integer idPaciente;
    private Integer idMedico;
    private List<Medicina> medicamentos;

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public List<Medicina> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicina> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
    
}
