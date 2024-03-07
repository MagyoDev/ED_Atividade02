package com.mado.palindromo;

import java.util.Scanner;

public class Palindromo {
    // Método para verificar se uma palavra é um palíndromo
    public static boolean ePalindromo(String palavra) {
        Pilha entrada1 = new Pilha(palavra.length()); // Pilha para armazenar a palavra original
        Pilha entrada2 = new Pilha(palavra.length()); // Pilha auxiliar para armazenar a palavra invertida

        // Armazenar cada letra da palavra nas duas pilhas
        for (char letra : palavra.toCharArray()) {
            entrada1.empilhar(letra);
            entrada2.empilhar(letra);
        }

        // Desempilhar a entrada2, criando a saída invertida
        Pilha aSaida = new Pilha(palavra.length());
        while (!entrada2.conferirPilhaVazia()) {
            aSaida.empilhar(entrada2.desempilhar());
        }

        // Comparar se a entrada é igual à saída invertida
        while (!entrada1.conferirPilhaVazia()) {
            if (Character.toLowerCase(entrada1.desempilhar()) != Character.toLowerCase(aSaida.desempilhar())) {
                return false;
            }
        }

        return true; // Se as pilhas forem iguais, a palavra é um palíndromo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        scanner.close();

        if (ePalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
