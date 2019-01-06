package com.helloWorld;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /**
         * Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado e
         * a quantidade de dias pelos quais ele foi alugado.
         * Calcule o preço a pagar, sabendo que o carro custa R$60,00 por dia e R$0,15 por km rodado.
         */
        AluguelCarro aluguelCarro = new AluguelCarro();
        aluguelCarro.precoAluguel();
    }
}
