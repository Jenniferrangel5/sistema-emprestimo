package com.projeto.emprestimo.emprestimo.service;

import com.projeto.emprestimo.emprestimo.model.Colaborador;
import com.projeto.emprestimo.emprestimo.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {
    private final ColaboradorRepository repository;

    public ColaboradorService(ColaboradorRepository repository){
        this.repository = repository;
    }





}
