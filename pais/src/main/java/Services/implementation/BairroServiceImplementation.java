/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import Services.BairroServices;
import Services.CidadeServices;
import br.com.model.Bairro;
import br.com.model.Cidade;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BairroRepository;
import repository.CidadeRepository;


@Service
public class BairroServiceImplementation implements BairroServices {
    @Autowired
    private BairroRepository repository;
    @Override
    public Bairro finById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Bairro> findAll() {
        return (Collection<Bairro>)repository.findAll();
    }

    @Override
    public Bairro create(Bairro bairro) {
        return repository.save(bairro);
    }

    @Override
    public Bairro update(Bairro bairro) {
        return repository.save(bairro);
    }

    @Override
    public void delete(Bairro bairro) {
        repository.delete(bairro);
    }
    
}
