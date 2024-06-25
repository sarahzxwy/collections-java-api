package main.java.Map.Pesquisa.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasmap;

    public ContagemPalavras() {
        this.palavrasmap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasmap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasmap.isEmpty()) {
            palavrasmap.remove(palavra);
        } else {
            System.out.println("Ainda não há palavras.");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if (!palavrasmap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : palavrasmap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                  maiorContagem = entry.getValue();
                  palavraMaisFrequente = entry.getKey();
                }
            }
        } else {
            System.out.println("Ainda não há palavras.");
        }
        return palavraMaisFrequente;
    }

    public int exibirContagemPalavra() {
        int contagemTotal = 0;
        if (!palavrasmap.isEmpty()) {
            for (int contagem : palavrasmap.values()) {
                contagemTotal += contagem;
            }
        } else {
            System.out.println("Ainda não há palavras.");
        }
        return contagemTotal;
    }

    public static void main(String[] args) {
        
        ContagemPalavras contagemCidades = new ContagemPalavras();

        contagemCidades.adicionarPalavra("Rio de Janeiro", 10);
        contagemCidades.adicionarPalavra("Salvador", 8);
        contagemCidades.adicionarPalavra("São Paulo", 6);
        contagemCidades.adicionarPalavra("Belo Horizonte", 9);

        contagemCidades.removerPalavra("Salvador");

        System.out.println("Contagem de visitas: " + contagemCidades.exibirContagemPalavra());

        System.out.println("Cidade mais frequente: " + contagemCidades.encontrarPalavraMaisFrequente());

        
    }
}
    

