package com.mado.palindromo;

class Pilha {
    private char[] palavras; // Array para armazenar as palavras
    private int topo_pilha; // Índice do topo da pilha

    // Construtor para inicializar a pilha com uma capacidade específica
    public Pilha(int capacidade) {
        this.palavras = new char[capacidade]; // Inicializa o array com a capacidade especificada
        this.topo_pilha = -1; // Inicializa o topo da pilha como -1 (indicando que a pilha está vazia)
    }

    // Verifica se a pilha está vazia
    public boolean conferirPilhaVazia() {
        return this.topo_pilha == -1;
    }

    // Adiciona uma palavra à pilha
    public void empilhar(char palavra) {
        if (this.topo_pilha == this.palavras.length - 1) { 
            throw new IllegalStateException("A pilha está cheia.");
        }
        this.palavras[++this.topo_pilha] = palavra; // Coloca uma nova palavra no topo
    }

    // Retira uma palavra da pilha
    public char desempilhar() {
        if (conferirPilhaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return this.palavras[this.topo_pilha--]; // Retorna e retira a palavra do topo
    }

    // Retorna o tamanho atual da pilha
    public int conferirPilhaTamanho() {
        return this.topo_pilha + 1;
    }

    // Retorna a palavra que está no topo da pilha
    public char topoLista() {
        if (conferirPilhaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return this.palavras[this.topo_pilha];
    }
}

