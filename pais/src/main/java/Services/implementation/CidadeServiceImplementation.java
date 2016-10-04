/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import Services.CidadeServices;
import br.com.model.Cidade;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CidadeRepository;


@Service
public class CidadeServiceImplementation implements CidadeServices {
    @Autowired
    private CidadeRepository repository;
    @Override
    public Cidade finById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Cidade> findAll() {
        return (Collection<Cidade>)repository.findAll();
    }

    @Override
    public Cidade create(Cidade cidade) {
        return repository.save(cidade);
    }

    @Override
    public Cidade update(Cidade cidade) {
        return repository.save(cidade);
    }

    @Override
    public void delete(Cidade cidade) {
        repository.delete(cidade);
    }
    
}
