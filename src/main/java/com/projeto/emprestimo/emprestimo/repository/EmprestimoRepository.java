package com.projeto.emprestimo.emprestimo.repository;

import com.projeto.emprestimo.emprestimo.model.Emprestimo;

import java.time.LocalDate;
import java.util.List;

public interface EmprestimoRepository {

    boolean existsByEquipamentoId(Long equipamentoId());

    List<Emprestimo> findByColaborador(Long colaboradorId0);
    List<Emprestimo> findByDataDevolucaoIsNullAndDataPrevistaDevolucaoBefore(LocalDate data);

}
