package main.java.List.Ordenacao.OdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listanumeros;

    public OrdenacaoNumeros() {
        this.listanumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listanumeros.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(this.listanumeros);
        if (!listanumeros.isEmpty()) {
            Collections.sort(numerosOrdenados);
            return numerosOrdenados;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(this.listanumeros);
        if (!listanumeros.isEmpty()) {
            numerosOrdenados.sort(Collections.reverseOrder());
            return numerosOrdenados;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacaoDeNumeros = new OrdenacaoNumeros();

        ordenacaoDeNumeros.adicionarNumero(7);
        ordenacaoDeNumeros.adicionarNumero(16);
        ordenacaoDeNumeros.adicionarNumero(79);
        ordenacaoDeNumeros.adicionarNumero(100);
        ordenacaoDeNumeros.adicionarNumero(256);
        ordenacaoDeNumeros.adicionarNumero(5);
        ordenacaoDeNumeros.adicionarNumero(90);

        System.out.println("Números: " + ordenacaoDeNumeros.listanumeros);

        System.out.println("Números ordenados por ordem ascendente(crescente): " + ordenacaoDeNumeros.ordernarAscendente());

        System.out.println("Números ordenados por ordem descendente(decrescente): " + ordenacaoDeNumeros.ordenarDescendente());
    }
}
