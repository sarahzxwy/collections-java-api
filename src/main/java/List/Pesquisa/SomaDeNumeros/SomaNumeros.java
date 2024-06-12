package main.java.List.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) 
            soma += numero;
        return soma;
    }

    public int econtrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        
        SomaNumeros somadorDeNumeros = new SomaNumeros();

        somadorDeNumeros.adicionarNumero(7);
        somadorDeNumeros.adicionarNumero(10);
        somadorDeNumeros.adicionarNumero(16);
        somadorDeNumeros.adicionarNumero(1);

        somadorDeNumeros.exibirNumeros();

        System.out.println("A soma de todos os números é: " + somadorDeNumeros.calcularSoma());

        System.out.println("O maior número é: " + somadorDeNumeros.econtrarMaiorNumero());
    }
}