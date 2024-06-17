package main.java.Set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosset;

    public AgendaContatos() {
        this.contatosset = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        contatosset.add(new Contato(nome, numeroTelefone));
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosset) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumeroTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosset) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumeroTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public void exibirContatos() {
        System.out.println(contatosset);
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaDeContatos = new AgendaContatos();

        agendaDeContatos.adicionarContato("Sarah", 551234568);
        agendaDeContatos.adicionarContato("Sarah", 1);
        agendaDeContatos.adicionarContato("Sarah 2", 559876543);
        agendaDeContatos.adicionarContato("Camila Professora", 552223456);
        agendaDeContatos.adicionarContato("Marcelo", 551111111);
        agendaDeContatos.adicionarContato("Juliana", 551112345);

        agendaDeContatos.exibirContatos();

        System.out.println("Contatos encontrados: " + agendaDeContatos.pesquisarPorNome("Sarah"));

        Contato contatoAtualizado = agendaDeContatos.atualizarNumeroContato("Marcelo", 551118976);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        agendaDeContatos.exibirContatos();
    }
}
