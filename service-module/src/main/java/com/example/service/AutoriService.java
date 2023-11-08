package com.example.service;

import com.example.entities.Autori;
import com.example.repository.AutoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutoriService {

    @Autowired
    AutoriRepository autoriRepository;


    public Autori findAutoreById(Integer id) throws Exception {
        Optional<Autori> autore = autoriRepository.findById(id);
        if(autore.isPresent()){
            return autore.get();
        }else{
            throw new Exception("Autore non trovato");
        }
    }

}
