package com.example.saito.services;

import com.example.saito.models.PessoaModel;
import com.example.saito.repositories.PesosaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private PesosaRepository pesosaRepository;

    @Autowired
    public List<PessoaModel>findall(){
        return pesosaRepository.findAll();
    }

    public PessoaModel criar(PessoaModel pessoaModel){
        return  pesosaRepository.save(pessoaModel);
    }
}
