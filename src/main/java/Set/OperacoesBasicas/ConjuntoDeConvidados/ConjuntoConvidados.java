package main.java.Set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosset;

    public ConjuntoConvidados() {
        this.convidadosset = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosset.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosset) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosset.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosset.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosset);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoDeConvidados = new ConjuntoConvidados();

        conjuntoDeConvidados.adicionarConvidado("Sarah", 1234);
        conjuntoDeConvidados.adicionarConvidado("Andrey", 1235);
        conjuntoDeConvidados.adicionarConvidado("Renata", 1234);
        conjuntoDeConvidados.adicionarConvidado("Mirian", 1236);
        conjuntoDeConvidados.adicionarConvidado("João", 1237);
        conjuntoDeConvidados.adicionarConvidado("Sabrina", 1238);
        
        conjuntoDeConvidados.exibirConvidados();

        System.out.println("Número de convidados: " + conjuntoDeConvidados.contarConvidados());

        conjuntoDeConvidados.removerConvidadoPorCodigoConvite(1238);

        conjuntoDeConvidados.exibirConvidados();

        System.out.println("Número de convidados: " + conjuntoDeConvidados.contarConvidados());

    }
}