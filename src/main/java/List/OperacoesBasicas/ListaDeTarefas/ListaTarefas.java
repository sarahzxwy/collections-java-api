package main.java.List.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefasLista;

    public ListaTarefas() {
        this.tarefasLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasLista.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefasLista) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefasLista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasLista.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasLista);
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Fazer compras");
        listaTarefas.adicionarTarefa("Ler um livro");
        listaTarefas.adicionarTarefa("fazer compras");
        listaTarefas.adicionarTarefa("Treinar");

        System.out.println("O número total de tarefas na lista é : " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.removerTarefa("fazer compras");

        System.out.println("O número total de tarefas na lista é : " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
