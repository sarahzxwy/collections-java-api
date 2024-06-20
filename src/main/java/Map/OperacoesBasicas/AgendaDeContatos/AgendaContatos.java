package main.java.Map.OperacoesBasicas.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendacontatosmap;

    public AgendaContatos() {
        this.agendacontatosmap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendacontatosmap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendacontatosmap.isEmpty()) {
            agendacontatosmap.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendacontatosmap.isEmpty()) {
            numeroPorNome = agendacontatosmap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("O Contato não foi encontrado na agenda.");
            }
        } else {
            System.out.println("A agenda de contatos está vazia!");
        }
         return numeroPorNome;
    }

    public void exibirContatos() {
        if (!agendacontatosmap.isEmpty()) {
            System.out.println(agendacontatosmap);
        } else {
            System.out.println("A agenda de contatos está vazia!");
        }
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaDeContatos = new AgendaContatos();

        agendaDeContatos.adicionarContato("Sarah", 551234567);
        agendaDeContatos.adicionarContato("Andrey", 551234588);
        agendaDeContatos.adicionarContato("Camila", 551111111);
        agendaDeContatos.adicionarContato("João", 551234555);
        agendaDeContatos.adicionarContato("Sabrina", 551234567);
        agendaDeContatos.adicionarContato("Sarah", 552222222);
        agendaDeContatos.adicionarContato("Camila Professora", 551234444);

        agendaDeContatos.exibirContatos();

        agendaDeContatos.removerContato("Camila");

        agendaDeContatos.exibirContatos();

        System.out.println("Contato encontrado: " + agendaDeContatos.pesquisarPorNome("Sarah"));

    }
}