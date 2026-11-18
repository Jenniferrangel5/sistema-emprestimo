package com.projeto.emprestimo.emprestimo.dto;

import jakarta.validation.constraints.NotNull;

public record EmprestimoRequest() {
    @NotNull(message = "O equipamento é obrigatório") Long equipamentoId.
    @NotNull(message = "O colaborador é obrigatório") Long colaboradorId
}
public final class EmprestimoRequest extends java.lang.Record{
    private final Long equipamentoId;
    private final Long colaboradorId;

    public EmprestimoRequest(Long equipamentoId, Long colaboradorId){
        this.colaboradorId = colaboradorId;
        this.equipamentoId = equipamentoId;
    }

    public Long equipamentoId(){
        return equipamentoId;
    }

    public Long colaboradorId(){
        return colaboradorId;
    }
}
