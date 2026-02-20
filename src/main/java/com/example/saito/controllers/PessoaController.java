package com.example.saito.controllers;

import com.example.saito.models.PessoaModel;
import com.example.saito.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    public List<PessoaModel>findall(){
        return pessoaService.findall();
    }

    public PessoaModel criar(@RequestBody PessoaModel pessoaModel){
        return pessoaService.criar(pessoaModel);
    }
}
