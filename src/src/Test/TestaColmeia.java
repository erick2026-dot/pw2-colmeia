package Test;

import Model.Operaria;
import Model.Rainha;
import Model.Zangao;

public class TestaColmeia {

    public static void main(String[] args){
        Operaria op = new Operaria("Bela", 20,5);
        Rainha ra = new Rainha("Ana",100,1500);
        Zangao za = new Zangao("Zeca",30,3);

        double total = 0;

        op.exibirInformacoes();
        op.executarAtividade();
        System.out.println(op.calcularConsumo());
        total += op.calcularConsumo();

        System.out.println();

        ra.exibirInformacoes();
        ra.executarAtividade();
        System.out.println(ra.calcularConsumo());
        total = ra.calcularConsumo();

        System.out.println();

        za.exibirInformacoes();
        za.executarAtividade();
        System.out.println(za.calcularConsumo());
        total = za.calcularConsumo();

        System.out.println();

        System.out.println("Consumo total: " + total + "mg");

        Operaria flora = new;
        Operaria("Flora",20,5);
        Zangao zeca = new Zangao("zeca",30,3);
        Rainha("Aurora",100,1500);

        flora.coletarRecurso();
        flora.defenderColmeia();

        zeca.defenderColmeia();

        System.out.println("Aurora: ");
        System.out.println("Não pussui capacidades especiais");
    }
}
