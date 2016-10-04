/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import br.com.model.Bairro;
import java.util.Collection;

/**
 *
 * @author PauloRicardo
 */
public interface BairroServices {
     Bairro finById(Long id);
    
    Collection<Bairro> findAll();
    
    Bairro create(Bairro bairro);
    
    Bairro update(Bairro bairro);
    
    void delete (Bairro bairro);
}
