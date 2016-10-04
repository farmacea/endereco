/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import br.com.model.Cidade;
import java.util.Collection;

/**
 *
 * @author PauloRicardo
 */
public interface CidadeServices {
     Cidade finById(Long id);
    
    Collection<Cidade> findAll();
    
    Cidade create(Cidade cidade);
    
    Cidade update(Cidade cidade);
    
    void delete (Cidade cidade);
}
