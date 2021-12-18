
package com.receta.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicina {
        
    @Id
    Integer idMedicina;
            
    String nombre;
    String marca;

    public Integer getIdMedicina() {
        return idMedicina;
    }

    public void setIdMedicina(Integer idMedicina) {
        this.idMedicina = idMedicina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

      
}
