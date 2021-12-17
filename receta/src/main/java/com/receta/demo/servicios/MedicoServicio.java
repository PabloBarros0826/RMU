
package com.receta.demo.servicios;

import com.receta.demo.entidades.Medico;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.receta.demo.repositorio.MedicoRepositorio;

@Service
public class MedicoServicio {
    
    @Autowired
    private MedicoRepositorio medicoRepositorio;
    
    @Transactional
    public void borrarMedico(String id){
        medicoRepositorio.deleteById(id);
    }
    
    @Transactional(readOnly = true)
    public Medico consultarMedico(String id){
        Optional<Medico> respuesta = medicoRepositorio.findById(id);
        
        Medico medico = respuesta.get();
        
        return medico;
    }
    
    @Transactional(readOnly = true)
    public List<Medico> actualizarMedico(){
        List<Medico> medicos = medicoRepositorio.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
        
        return medicos;
    }
    
    public void validar(String nombre) throws Exception{
        if(nombre == null || nombre.isEmpty()){
            throw new Exception();
        }
    }
    
    public void validar2(String apellido) throws Exception{
        if(apellido == null || apellido.isEmpty()){
            throw new Exception();
        }
    }
}
