package Model;

import Enums.FuncaoAbelhaEnum;

public class Zangao extends Abelha{
    private int voos;

    public Zangao(String nome, int idadeDias, int voos){
        super(nome, idadeDias, FuncaoAbelhaEnum.ZANGAO);
        this.voos = voos;
    }

    public void executarAtividade(){
        System.out.println("Fazendo voos de acasalamento");
    }

    public double calcularConsumo(){
        return 15 + (voos * 3);
    }
}

