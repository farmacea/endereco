/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import br.com.model.Estado;
import java.util.Collection;

/**
 *
 * @author PauloRicardo
 */
public interface EstadoServices {
     Estado finById(Long id);
    
    Collection<Estado> findAll();
    
    Estado create(Estado estado);
    
    Estado update(Estado estado);
    
    void delete (Estado estado);
}
