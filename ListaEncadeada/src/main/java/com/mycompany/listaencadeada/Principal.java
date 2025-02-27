/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author reido
 */
   public class Principal { 
    public static void main(String[] args) { 
        // Criação de uma nova lista encadeada
        ListaEncadeada listaEncadeada = new ListaEncadeada(); 
        
        // Instância da classe Principal para chamar métodos auxiliares
        Principal principal = new Principal(); 

        // Adiciona pessoas à lista encadeada
        principal.adicionarPessoa(listaEncadeada); 

        // Remove alguns elementos da lista
        principal.remover(listaEncadeada); 

        // Percorre a lista e imprime os valores das células
        while (listaEncadeada.temProximo()) { 
            System.out.println(listaEncadeada.getPosicaoAtual().getValor()); 
        } 
    } 

    /**
     * Método auxiliar para adicionar pessoas à lista encadeada.
     * @param listaEncadeada A lista na qual as pessoas serão adicionadas.
     */
    private void adicionarPessoa(ListaEncadeada listaEncadeada) { 
        Pessoa p1 = new Pessoa(1, "João", "jp@gmail.com"); 
        Pessoa p2 = new Pessoa(2, "Maria", "maria@gmail.com"); 
        Pessoa p3 = new Pessoa(3, "Bruno", "bruno@gmail.com"); 
        Pessoa p4 = new Pessoa(4, "José", "jose@gmail.com"); 
        Pessoa p5 = new Pessoa(5, "Mário", "mario@gmail.com"); 
        Pessoa p6 = new Pessoa(6, "Eduardo", "dudu@gmail.com"); 

        // Adiciona os objetos Pessoa à lista encadeada
        listaEncadeada.adicionar(p1); 
        listaEncadeada.adicionar(p2); 
        listaEncadeada.adicionar(p3); 
        listaEncadeada.adicionar(p4); 
        listaEncadeada.adicionar(p5); 
        listaEncadeada.adicionar(p6); 
    } 

    /**
     * Método auxiliar para remover elementos da lista encadeada.
     * Remove os três últimos elementos adicionados.
     * @param listaEncadeada A lista da qual os elementos serão removidos.
     */
    private void remover(ListaEncadeada listaEncadeada) { 
        listaEncadeada.remover(); 
        listaEncadeada.remover(); 
        listaEncadeada.remover(); 
    } 
}