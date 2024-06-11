package main.java.List.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itenscarrinho;
    
    public CarrinhoCompras() {
        this.itenscarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itenscarrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itenscarrinho.isEmpty()) {
            for (Item i : itenscarrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
                }
            }
         itenscarrinho.removeAll(itensParaRemover);
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itenscarrinho.isEmpty()) {
            for (Item item : itenscarrinho) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            } 
             return valorTotal;

        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itenscarrinho.isEmpty()) {
            System.out.println(this.itenscarrinho);
        } else {
            System.out.println("Lista vazia. Adicione itens!");
        }
    }
    
    @Override
    public String toString() {
        return "Carrinho de Compras{" + 
        "itens = " + itenscarrinho + 
        '}';
    }

    public static void main(String[] args) {
        
        CarrinhoCompras carrinhoDeCompras = new CarrinhoCompras();

        carrinhoDeCompras.adicionarItem("Borracha", 3d, 4);
        carrinhoDeCompras.adicionarItem("Mochila", 150d, 1);
        carrinhoDeCompras.adicionarItem("Estojo", 25d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 3d, 1);

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total da compra: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Borracha");

        carrinhoDeCompras.exibirItens();
        
        System.out.println("Valor total da compra: " + carrinhoDeCompras.calcularValorTotal());

    }
}