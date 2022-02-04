package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario{

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }
}
