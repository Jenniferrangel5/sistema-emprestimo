package com.projeto.emprestimo.emprestimo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "EQUIPAMENTO_ID", nullable = false)
    private Equipamento equipamento;

    @ManyToOne
    @JoinColumn(name = "COLABORADOR_ID", nullable = false)
    private Colaborador colaborador;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    @Column(nullable = false)
    private LocalDate dataPrevistaDevolucao;

    private LocalDate dataDevolucao;

    public void devolver(LocalDate data) {
        if (dataDevolucao != null) {
            throw new IllegalStateException("Empréstimo já devolvido");
        }

        this.dataDevolucao = data;
    }

    public boolean estaAtrasadoEm(LocalDate data) {
        return dataDevolucao == null
                && dataPrevistaDevolucao.isBefore(data);
    }

    public boolean isAtrasado() {
        return estaAtrasadoEm(LocalDate.now());
    }

    public Emprestimo (Equipamento equipamento, Colaborador colaborador, LocalDate hoje){
        this.equipamento = equipamento;
        this.colaborador = colaborador;
        this.dataEmprestimo = hoje;
        this.dataPrevistaDevolucao = hoje.plusDays(14);
    }

    public Emprestimo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

}
