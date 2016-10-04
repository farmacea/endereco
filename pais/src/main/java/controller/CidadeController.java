/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Services.CidadeServices;
import br.com.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PauloRicardo
 */
@RestController
@RequestMapping(value = "/trabalho/cidade",produces = MediaType.APPLICATION_JSON_VALUE)// usar post quando a informação é estarna
public class CidadeController {
     @Autowired
    private CidadeServices services;
    
@RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Cidade get(Long id){
        System.out.println("recebendo uma requisição");
        return  services.finById(id);
    }
    
}
