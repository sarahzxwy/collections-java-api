package main.java.Map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionariomap;

    public Dicionario() {
        this.dicionariomap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionariomap.put(palavra, definicao);
    }
    
    public void removerPalavra(String palavra) {
        if (!dicionariomap.isEmpty()) {
            dicionariomap.remove(palavra);
        } else {
            System.out.println("Dicionário vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionariomap.get(palavra);
            if (definicao != null) {
                return definicao;
            } 
            return "Palavra não encontrada!";
    }

    public void exibirPalavras() {
        if (!dicionariomap.isEmpty()) {
            System.out.println(dicionariomap);
        } else {
            System.out.println("Dicionário vazio!");
        }
    }

    public static void main(String[] args) {
        
        Dicionario dicionarioProgramacao = new Dicionario();

        dicionarioProgramacao.adicionarPalavra("typescript", "Linguagem de programação de código aberto.");
        dicionarioProgramacao.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionarioProgramacao.adicionarPalavra("javascript", "Linguagem de programação interpretada estruturada, de script em alto nível.");
        dicionarioProgramacao.adicionarPalavra("git", "Sistema de controle de versões distribuído.");
        dicionarioProgramacao.adicionarPalavra("github", "Plataforma de hospedagem de código-fonte e arquivos com controle de versão usando o Git.");

        dicionarioProgramacao.exibirPalavras();

        dicionarioProgramacao.removerPalavra("typescript");

        dicionarioProgramacao.exibirPalavras();

        System.out.println(dicionarioProgramacao.pesquisarPorPalavra("typescript"));

        
        System.out.println(dicionarioProgramacao.pesquisarPorPalavra("java"));


    }
}
