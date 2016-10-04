/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.com.model.Pais;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
/**
 *
 * @author PauloRicardo
 */
@Repository
@RepositoryRestResource(collectionResourceRel = "pais", path = "paises")
public interface PaisRepository extends CrudRepository<Pais, Long>{
    @Query("SELECT p.nome FROM pais p where p.id = :id")
    Pais findById(Long id);
}