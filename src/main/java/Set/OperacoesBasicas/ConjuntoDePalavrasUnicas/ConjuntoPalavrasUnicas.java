package main.java.Set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasunicasset;

    public ConjuntoPalavrasUnicas() {
        this.palavrasunicasset = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasunicasset.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasunicasset.isEmpty()) {
            if (palavrasunicasset.contains(palavra)) {
                palavrasunicasset.remove(palavra);
            } else {
                System.out.println("A Palavra não foi encontrada no conjunto.");
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasunicasset.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
            System.out.println(palavrasunicasset);
    }

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjuntoDePaises = new ConjuntoPalavrasUnicas();

        conjuntoDePaises.adicionarPalavra("Brasil");
        conjuntoDePaises.adicionarPalavra("Argentina");
        conjuntoDePaises.adicionarPalavra("Uruguai");
        conjuntoDePaises.adicionarPalavra("Chile");
        conjuntoDePaises.adicionarPalavra("Paraguai");
        conjuntoDePaises.adicionarPalavra("Portugal");

        conjuntoDePaises.exibirPalavrasUnicas();

        conjuntoDePaises.removerPalavra("Portugal");

        conjuntoDePaises.exibirPalavrasUnicas();

        System.out.println("O Brasil está no conjunto? " + conjuntoDePaises.verificarPalavra("Brasil"));


    }
}
