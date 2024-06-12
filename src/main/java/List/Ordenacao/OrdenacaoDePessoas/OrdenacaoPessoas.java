package main.java.List.Ordenacao.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listapessoas;

    public OrdenacaoPessoas() {
        this.listapessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listapessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listapessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listapessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenacaoDePessoas = new OrdenacaoPessoas();

        ordenacaoDePessoas.adicionarPessoa("Sofia", 18, 1.62);
        ordenacaoDePessoas.adicionarPessoa("Caio", 28, 1.76);
        ordenacaoDePessoas.adicionarPessoa("Leonardo", 20, 1.75);
        ordenacaoDePessoas.adicionarPessoa("Joana", 38, 1.58);

        System.out.println(ordenacaoDePessoas.listapessoas);

        System.out.println("Pessoas ordenadas por idade: " + ordenacaoDePessoas.ordenarPorIdade());

        System.out.println("Pessoas ordenadas por altura: " + ordenacaoDePessoas.ordenarPorAltura());

    }
}
