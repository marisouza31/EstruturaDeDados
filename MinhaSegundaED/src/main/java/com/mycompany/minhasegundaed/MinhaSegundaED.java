/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minhasegundaed;

/**
 *
 * @author Mariana Ocireu e Rebeca
 */
public class MinhaSegundaED {

    private final String[] nomes = new String[26];
    private int totalNomes = 0;

    public boolean validaNome(String nome) {
        return nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ]+");
    }

    private int getIndice(String nome) {
        if (nome == null || nome.isEmpty() || !validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido: '" + nome + "'. Deve conter apenas letras sem caracteres especiais ou números.");
        }
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));

        switch (primeiraLetra) {
            case 'A': return 0;
            case 'B': return 1;
            case 'C': return 2;
            case 'D': return 3;
            case 'E': return 4;
            case 'F': return 5;
            case 'G': return 6;
            case 'H': return 7;
            case 'I': return 8;
            case 'J': return 9;
            case 'K': return 10;
            case 'L': return 11;
            case 'M': return 12;
            case 'N': return 13;
            case 'O': return 14;
            case 'P': return 15;
            case 'Q': return 16;
            case 'R': return 17;
            case 'S': return 18;
            case 'T': return 19;
            case 'U': return 20;
            case 'V': return 21;
            case 'W': return 22;
            case 'X': return 23;
            case 'Y': return 24;
            case 'Z': return 25;
            default:
                throw new IllegalArgumentException("O nome deve começar com uma letra de A a Z.");
        }
    }

    public void adiciona(String nome) {
        try {
            int posicao = getIndice(nome);
            if (!posicaoOcupada(posicao)) {
                nomes[posicao] = nome;
                totalNomes++;
            } else {
                System.out.println("A posição " + posicao + " já está ocupada por " + nomes[posicao]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return nomes[posicao] != null;
    }

    public void remove(String nome) {
        int posicao = getIndice(nome);
        
        System.out.println("\nEstrutura de nomes armazenados antes da remoção de " + nome + ":");
        exibirEstrutura();
        
        if (posicaoOcupada(posicao) && nomes[posicao].equals(nome)) {
            nomes[posicao] = null; // Remove o nome
            totalNomes--; // Atualiza o contador
            
            System.out.println("\nNome '" + nome + "' removido com sucesso.");
        } else {
            System.out.println("\nNome '" + nome + "' não encontrado na estrutura.");
        }
        
        System.out.println("\nEstrutura de nomes armazenados após a remoção de " + nome + ":");
        exibirEstrutura();
    }

    public boolean contem(String nome) {
        int posicao = getIndice(nome);
        return posicaoOcupada(posicao) && nomes[posicao].equals(nome);
    }

    public String getNome(int posicao) {
        if (posicao < 0 || posicao >= 26) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        return nomes[posicao];
    }

    public int totalNomes() {
        return totalNomes;
    }

    public void exibirEstrutura() {
        System.out.println("\nEstrutura de nomes armazenados:");
        for (int i = 0; i < 26; i++) {
            if (nomes[i] != null) {
                System.out.println("Posição " + i + " (" + (char) ('A' + i) + "): " + nomes[i]);
            }
        }
    }

    public static void main(String[] args) {
        MinhaSegundaED estrutura = new MinhaSegundaED();

        // Testes com nomes válidos
        estrutura.adiciona("Ana");
        estrutura.adiciona("Bia");
        estrutura.adiciona("Carlos");
        estrutura.adiciona("Davi");
        estrutura.adiciona("Elisa");
        estrutura.adiciona("Fabio");
        estrutura.adiciona("Gabi");
        estrutura.adiciona("Hanna");
        estrutura.adiciona("Ingrid");
        estrutura.adiciona("Joao");
        estrutura.adiciona("Karol");
        estrutura.adiciona("Luan");
        estrutura.adiciona("Melissa");
        estrutura.adiciona("Natalia");
        estrutura.adiciona("Otavio");

        // Testes com nomes inválidos
        estrutura.adiciona("Rebeca!");
        estrutura.adiciona("M4ria");   
        estrutura.adiciona("12345"); 
        estrutura.adiciona("J@o");    
        estrutura.adiciona(" "); 

        System.out.println("\nA estrutura contém 'Davi'? " + estrutura.contem("Davi"));
        System.out.println("A estrutura contém 'Patricia'? " + estrutura.contem("Patricia"));
        System.out.println("Total de nomes armazenados: " + estrutura.totalNomes());

        estrutura.remove("Gabi");
    }
}
