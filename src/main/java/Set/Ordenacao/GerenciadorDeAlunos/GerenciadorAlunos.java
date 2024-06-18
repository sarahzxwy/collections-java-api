package main.java.Set.Ordenacao.GerenciadorDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosset;

    public GerenciadorAlunos() {
        this.alunosset = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosset.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosset.isEmpty()) {
            for (Aluno a : alunosset) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            } 
            alunosset.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("Conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matrícula não encontrada.");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosset);
        if (!alunosset.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunosset.isEmpty()) {
            alunosPorNota.addAll(alunosset);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciadorDeAlunos = new GerenciadorAlunos();

        gerenciadorDeAlunos.adicionarAluno("Sabrina", 123459L, 7.6);
        gerenciadorDeAlunos.adicionarAluno("João", 123457L, 8.0);
        gerenciadorDeAlunos.adicionarAluno("Fernando", 1234568L, 6.5);
        gerenciadorDeAlunos.adicionarAluno("Renata", 123456L, 9.0 );
        gerenciadorDeAlunos.adicionarAluno("Sofia", 123461L, 9.2);

        System.out.println("Alunos: " + gerenciadorDeAlunos.alunosset);
        
        gerenciadorDeAlunos.removerAlunoPorMatricula(123456L);

        System.out.println("Alunos: " + gerenciadorDeAlunos.alunosset);

        gerenciadorDeAlunos.removerAlunoPorMatricula(0000L);

        System.out.println("Alunos por ordem alfabética:");
        gerenciadorDeAlunos.exibirAlunosPorNome();

        System.out.println("Alunos por média:");
        gerenciadorDeAlunos.exibirAlunosPorNota();

    }
}
