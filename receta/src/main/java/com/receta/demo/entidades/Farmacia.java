
package com.receta.demo.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Farmacia {
    
    @Id
    Integer idFarmacia;
    
    List<Medicina> Medicamentos;

    public Integer getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(Integer idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public List<Medicina> getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(List<Medicina> Medicamentos) {
        this.Medicamentos = Medicamentos;
    }

        
}
