package com.projeto.emprestimo.emprestimo.exception;

public class ConflitoException extends RuntimeException{
    public ConflitoException(String mensagem){
        super(mensagem);
    }
}
