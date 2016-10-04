/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.com.model.Estado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author PauloRicardo
 */
@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long>{
    @Query("SELECT p.nome FROM estado p where p.id = :id") 
    Estado findById(Long id);
}