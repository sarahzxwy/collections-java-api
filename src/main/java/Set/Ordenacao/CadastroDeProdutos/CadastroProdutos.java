package main.java.Set.Ordenacao.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosset;

    public CadastroProdutos() {
        this.produtosset = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosset.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosset);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosset);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        
        CadastroProdutos cadastroDeProdutosTecnologicos = new CadastroProdutos();
      
        cadastroDeProdutosTecnologicos.adicionarProduto(2L, "Notebook", 2500d, 5);
        cadastroDeProdutosTecnologicos.adicionarProduto(1L, "Mouse", 20d, 15);
        cadastroDeProdutosTecnologicos.adicionarProduto(3L, "Smartphone", 1000d, 10);
        cadastroDeProdutosTecnologicos.adicionarProduto(4L, "Teclado", 50d, 15);
        cadastroDeProdutosTecnologicos.adicionarProduto(5L, "Headphone", 40d, 15);

        System.out.println(cadastroDeProdutosTecnologicos.produtosset);

        System.out.println("Produtos por nome: " + cadastroDeProdutosTecnologicos.exibirProdutosPorNome());

        System.out.println("Produtos por preço: " + cadastroDeProdutosTecnologicos.exibirProdutosPorPreco());

   
    }
}
