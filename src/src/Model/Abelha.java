package Model;

import Enums.FuncaoAbelhaEnum;

public class Abelha {
    private String nome;
    private int idadeDias;
    private FuncaoAbelhaEnum funcao;

    public Abelha(String nome, int idadeDias, FuncaoAbelhaEnum funcao){
        this.nome = nome;
        this.idadeDias = idadeDias;
        this.funcao = funcao;
    }

    public String getNome(){
        return nome;
    }

    public int getIdadeDias(){
        return idadeDias;
    }

    public FuncaoAbelhaEnum getFuncao(){
        return funcao;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idadeDias);
        System.out.println("Função: "+ funcao);
    }
}

