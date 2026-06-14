package Model;

import Enums.FuncaoAbelhaEnum;

public class Rainha extends Abelha {
    private int ovos;

    public Rainha(String nome, int idadeDias, int ovos) {
        super(nome, idadeDias, FuncaoAbelhaEnum.RAINHA);
        this.ovos = ovos;
    }

    public void executarAtividade(){
        System.out.println("Colocando ovos");
    }

    public double calcularConsumo(){
        return 20 + (ovos * 0.01);
    }
}
