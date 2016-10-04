/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.com.model.Logradouro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author PauloRicardo
 */
@Repository
public interface LogradouroRepository extends CrudRepository<Logradouro, Long>{
    @Query("SELECT p.nome FROM Logradouro p where p.id = :id") 
    Logradouro findById(Long id);
}