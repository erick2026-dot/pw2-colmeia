package Model;

import Enums.FuncaoAbelhaEnum;

public class Operaria extends Abelha{
    private int horasVoo;

    public Operaria(String nome, int idadeDias, int horasVoo){
        super(nome, idadeDias, FuncaoAbelhaEnum.OPERARIA);
        this.horasVoo = horasVoo;
    }

    public void executarAtividade(){
        System.out.println("Coletando nectar e protengendo a colmeia.");
    }

    public double calcularConsumo(){
        return 10 + (horasVoo * 2);
    }
}
