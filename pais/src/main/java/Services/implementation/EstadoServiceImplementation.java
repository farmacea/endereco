/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import Services.EstadoServices;
import br.com.model.Estado;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EstadoRepository;


@Service
public class EstadoServiceImplementation implements EstadoServices {
    @Autowired
    private EstadoRepository repository;
    @Override
    public Estado finById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Estado> findAll() {
        return (Collection<Estado>)repository.findAll();
    }

    @Override
    public Estado create(Estado estado) {
        return repository.save(estado);
    }

    @Override
    public Estado update(Estado estado) {
        return repository.save(estado);
    }

    @Override
    public void delete(Estado estado) {
        repository.delete(estado);
    }
    
}
