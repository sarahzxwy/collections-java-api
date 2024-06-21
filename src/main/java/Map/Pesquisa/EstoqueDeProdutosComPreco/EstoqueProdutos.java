package main.java.Map.Pesquisa.EstoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosmap;

    public EstoqueProdutos() {
        this.produtosmap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosmap.put(cod, new Produto(nome, preco, quantidade));
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!produtosmap.isEmpty()) {
          for (Produto p : produtosmap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
          }
        } else {
            System.out.println("Estoque vazio!");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtosmap.isEmpty()) {
            for (Produto p : produtosmap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p; 
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("Estoque Vazio!");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtosmap.isEmpty()) {
            for (Produto p : produtosmap.values()) {
                if (p.getPreco() <  menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                   
                }
            }
        } else {
            System.out.println("Estoque Vazio!");
        }
        return produtoMaisBarato;
    }

    public Produto obterMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValor = null;
        double maiorValorTotalProduto = 0d;
        if (!produtosmap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosmap.entrySet()) {
                double valorProdutoEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEstoque > maiorValorTotalProduto) {
                    maiorValorTotalProduto = valorProdutoEstoque;
                    produtoMaiorQuantidadeValor= entry.getValue();
                  }
            }
        } else {
            System.out.println("Estoque Vazio!");
        }
        return produtoMaiorQuantidadeValor;
    }

    public void exibirProdutos() {
        if (!produtosmap.isEmpty()) {
            System.out.println(produtosmap);
        } else {
            System.out.println("Estoque vazio!");
        }
    }

    public static void main(String[] args) {
        
        EstoqueProdutos estoqueDeProdutosTecnologicos = new EstoqueProdutos();

        estoqueDeProdutosTecnologicos.adicionarProduto(2L, "Placa de vídeo", 3, 1400d);
        estoqueDeProdutosTecnologicos.adicionarProduto(3L, "Gabinete", 10, 200d);
        estoqueDeProdutosTecnologicos.adicionarProduto(4L, "Teclado", 20, 50d);
        estoqueDeProdutosTecnologicos.adicionarProduto(8L, "Memória SSD", 15, 180d);
        estoqueDeProdutosTecnologicos.adicionarProduto(5L, "Memória RAM", 18, 250d);   
        estoqueDeProdutosTecnologicos.adicionarProduto(1L, "Mouse", 20, 20d);

        estoqueDeProdutosTecnologicos.exibirProdutos();

       System.out.println("Valor total do estoque: R$" + estoqueDeProdutosTecnologicos.calcularValorTotalEstoque());

       Produto produtoMaisBarato = estoqueDeProdutosTecnologicos.obterProdutoMaisBarato();
       System.out.println("Produto mais barato: " + produtoMaisBarato);

       Produto produtoMaisCaro = estoqueDeProdutosTecnologicos.obterProdutoMaisCaro();
       System.out.println("Produto mais caro: " + produtoMaisCaro);

       Produto produtoMaiorQuantidadeValor = estoqueDeProdutosTecnologicos.obterMaiorQuantidadeValorTotalNoEstoque();
       System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValor);
   
    }
}