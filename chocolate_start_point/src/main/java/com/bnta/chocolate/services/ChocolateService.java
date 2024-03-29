package com.bnta.chocolate.services;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateService estateService;

    public List<Chocolate> getAllChocolates(){
        return chocolateRepository.findAll();
    }

    public Chocolate findSingleChocolate(Long id){
        return chocolateRepository.findById(id).get();
    }

}
