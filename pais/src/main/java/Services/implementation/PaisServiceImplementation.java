/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import Services.PaisServices;
import br.com.model.Pais;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PaisRepository;


@Service
public class PaisServiceImplementation implements PaisServices {
    @Autowired
    private PaisRepository repository;
    @Override
    public Pais finById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Pais> findAll() {
        return (Collection<Pais>)repository.findAll();
    }

    @Override
    public Pais create(Pais pais) {
        return repository.save(pais);
    }

    @Override
    public Pais update(Pais pais) {
        return repository.save(pais);
    }

    @Override
    public void delete(Pais pais) {
        repository.delete(pais);
    }
    
}
