package com.projeto.emprestimo.emprestimo.exception;

public class ConflitoException extends RuntimeException{
    ConflitoException(String mensagem){
        super(mensagem);
    }
}
