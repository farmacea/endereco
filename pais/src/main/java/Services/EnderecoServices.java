/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import br.com.model.Endereco;
import java.util.Collection;

/**
 *
 * @author PauloRicardo
 */
public interface EnderecoServices {
     Endereco finById(Long id);
    
    Collection<Endereco> findAll();
    
    Endereco create(Endereco endereco);
    
    Endereco update(Endereco endereco);
    
    void delete (Endereco endereco);
}
