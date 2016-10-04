/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import br.com.model.Logradouro;
import java.util.Collection;

/**
 *
 * @author PauloRicardo
 */
public interface LogradouroServices {
     Logradouro finById(Long id);
    
    Collection<Logradouro> findAll();
    
    Logradouro create(Logradouro logradouro);
    
    Logradouro update(Logradouro logradouro);
    
    void delete (Logradouro logradouro);
}
