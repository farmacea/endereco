/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import br.com.model.Pais;
import java.util.Collection;

/**
 *
 * @author PauloRicardo
 */
public interface PaisServices {
     Pais finById(Long id);
    
    Collection<Pais> findAll();
    
    Pais create(Pais pais);
    
    Pais update(Pais pais);
    
    void delete (Pais pais);
}
