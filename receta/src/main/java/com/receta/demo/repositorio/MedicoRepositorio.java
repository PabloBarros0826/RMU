/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.receta.demo.repositorio;

import com.receta.demo.entidades.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, String>{
    
        @Query("SELECT m FROM Medico m WHERE m.nombre = :nombre")
        public Medico buscarAutorPorNombre(@Param("nombre") String nombre);
    
        @Query("SELECT m FROM Medico m WHERE m.id = :id")
        public Medico buscarAutorPorId(@Param("id") String id);
}
