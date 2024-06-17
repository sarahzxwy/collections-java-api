package main.java.Set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;


public class ListaTarefas {
    private Set<Tarefa> tarefasset;

    public ListaTarefas() {
        this.tarefasset = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasset.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasset.isEmpty()) {
            for (Tarefa t : tarefasset) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasset.remove(tarefaParaRemover);
        } else {
            System.out.println("Conjunto vazio!");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public int contarTarefas() {
        return tarefasset.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasset) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasset) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasset) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaMarcadaComoPendente = null;
        for (Tarefa t : tarefasset) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcadaComoPendente = t;
                break;
            }
        }
        if (tarefaMarcadaComoPendente != null) {
            if (tarefaMarcadaComoPendente.isConcluida()) {
                tarefaMarcadaComoPendente.setConclusao(false);
            }
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void limparListaTarefas() {
        if (!tarefasset.isEmpty()) {
            tarefasset.clear();
        } else {
            System.out.println("A lista já está vazia!");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefasset);
    }

    public static void main(String[] args) {
        
        ListaTarefas listaDeTarefas = new ListaTarefas();

        listaDeTarefas.adicionarTarefa("Organizar o quarto");
        listaDeTarefas.adicionarTarefa("Estudar");
        listaDeTarefas.adicionarTarefa("Fazer compras");
        listaDeTarefas.adicionarTarefa("Organizar compras");
        listaDeTarefas.adicionarTarefa("Fazer exercícios");
        listaDeTarefas.adicionarTarefa("Estudar para prova");

        listaDeTarefas.exibirTarefas();

        System.out.println("Número de tarefas na lista: " + listaDeTarefas.contarTarefas()); 

        listaDeTarefas.removerTarefa("estudar para prova");

        listaDeTarefas.exibirTarefas();

        System.out.println("Número de tarefas na lista: " + listaDeTarefas.contarTarefas()); 

        listaDeTarefas.marcarTarefaConcluida("Fazer compras");
        listaDeTarefas.marcarTarefaConcluida("Organizar o quarto");
        listaDeTarefas.marcarTarefaConcluida("Fazer exercícios");
        listaDeTarefas.marcarTarefaConcluida("Estudar");

        System.out.println(listaDeTarefas.obterTarefasConcluidas());

        listaDeTarefas.marcarTarefaPendente("Organizar compras");

        System.out.println(listaDeTarefas.obterTarefasPendentes());

        listaDeTarefas.marcarTarefaConcluida("Organizar compras");

        listaDeTarefas.exibirTarefas(); 

        listaDeTarefas.limparListaTarefas();

        listaDeTarefas.exibirTarefas();
        
        System.out.println("Número de tarefas na lista: " + listaDeTarefas.contarTarefas()); 

    }

}
