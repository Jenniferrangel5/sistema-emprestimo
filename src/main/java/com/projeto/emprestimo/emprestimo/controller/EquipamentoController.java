package com.projeto.emprestimo.emprestimo.controller;

import com.projeto.emprestimo.emprestimo.model.Equipamento;
import com.projeto.emprestimo.emprestimo.model.TipoEquipamento;
import com.projeto.emprestimo.emprestimo.service.EquipamentoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    private final EquipamentoService service;
    public EquipamentoController(EquipamentoService service){
        this.service = service;
    }

    @GetMapping
    public List<Equipamento> listar (@RequestParam(required = false)TipoEquipamento tipo){
        return service.listar(tipo);
    }

    @GetMapping("/{id}")
    public Equipamento buscar(@PathVariable Long id){
        return service.buscar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Equipamento cadastrar(@RequestBody @Valid Equipamento equipamento){
        return service.cadastrar(equipamento);
    }

}
