/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import Services.PaisServices;
import br.com.model.Pais;
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
@RequestMapping(value = "/trabalho/pais",produces = MediaType.APPLICATION_JSON_VALUE)// usar post quando a informação é estarna
public class PaisController {
     @Autowired
    private PaisServices services;
    
@RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Pais get(Long id){
        System.out.println("recebendo uma requisição");
        return  services.finById(id);
    }
    
}
