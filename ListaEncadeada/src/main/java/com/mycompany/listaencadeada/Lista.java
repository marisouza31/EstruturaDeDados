/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

import javax.swing.JOptionPane;

/**
 *
 * @author reido
 */
public class Lista {
    No primeiro, ultimo;  // Referências para o primeiro e o último nó da lista
    int totalNos;         // Conta o total de nós na lista

    /**
     * Construtor da classe Lista. Inicializa a lista como vazia.
     */
    public Lista(){
        primeiro = ultimo = null;  // A lista começa vazia, sem nós
        totalNos = 0;              // Inicializa o contador de nós como zero
    }

    /**
     * Retorna o total de nós presentes na lista.
     * @return totalNos
     */
    public int getTotalNos(){
        return totalNos;
    }

    /**
     * Verifica se a lista está vazia.
     * @return true se a lista estiver vazia, false caso contrário
     */
    public boolean checkIfListaVazia(){
        if (getTotalNos() == 0){
            return true;  // A lista está vazia
        }
        return false;     // A lista não está vazia
    }

    /**
     * Insere um nó no início da lista.
     * @param n Nó a ser inserido
     */
    public void inserirNoInicio(No n) {
        if (checkIfListaVazia()) {
            // Se a lista estiver vazia, o primeiro e último nó são o novo nó
            primeiro = ultimo = n;
        } else {
            // Caso contrário, o novo nó aponta para o primeiro nó da lista
            n.prox = primeiro;
            primeiro = n;  // O novo nó se torna o primeiro da lista
        }
        totalNos++;  // Incrementa o contador de nós
    }

    /**
     * Insere um nó no final da lista.
     * @param n Nó a ser inserido
     */
    public void inserirNoFim(No n){
        if (checkIfListaVazia()){
            // Se a lista estiver vazia, o primeiro e o último nó são o novo nó
            primeiro = ultimo = n;
        } else {
            // Caso contrário, o último nó aponta para o novo nó
            ultimo.prox = n;
            ultimo = n;  // O novo nó se torna o último da lista
        }
        totalNos++;  // Incrementa o contador de nós
    }

    /**
     * Exclui um nó específico da lista.
     * @param n Nó a ser excluído
     */
    public void excluirNo(No n){
        No noAtual;  // Nó atual na iteração
        No noAnterior;  // Nó anterior ao nó atual
        noAtual = noAnterior = primeiro;  // Inicia a busca a partir do primeiro nó
        int contador = 1;  // Contador de iterações

        // Verifica se a lista não está vazia
        if (checkIfListaVazia() == false){
            // Itera pelos nós até encontrar o nó a ser excluído
            while (contador <= getTotalNos() && noAtual.valor != n.valor){
                noAnterior = noAtual;  // Atualiza o nó anterior
                noAtual = noAtual.prox;  // Atualiza o nó atual
                contador++;
            }

            // Se o nó a ser excluído foi encontrado
            if(noAtual.valor == n.valor){
                if (getTotalNos() == 1){
                    // Se for o único nó, limpa a lista
                    primeiro = ultimo = null;
                } else {
                    // Se o nó a ser excluído é o primeiro
                    if (noAtual == primeiro){
                        primeiro = noAtual.prox;
                    } else {
                        // Se o nó a ser excluído não é o primeiro, ajusta a referência do nó anterior
                        noAnterior.prox = noAtual.prox;
                    }
                }
                totalNos--;  // Decrementa o contador de nós
            }
        }
    }

    /**
     * Exibe os valores de todos os nós na lista em uma janela de diálogo.
     */
    public void exibirLista(){
        No temp = primeiro;  // Inicia com o primeiro nó da lista
        String valores = "";  // String para armazenar os valores dos nós
        int contador = 1;  // Contador de iterações

        // Verifica se a lista não está vazia
        if (checkIfListaVazia() == false){
            // Itera pelos nós e adiciona os valores à string
            while (contador <= getTotalNos()){
                valores += Integer.toString(temp.valor) + "-";  // Adiciona o valor do nó à string
                temp = temp.prox;  // Avança para o próximo nó
                contador++;
            }
        }
        // Exibe os valores dos nós na lista em uma janela de diálogo
        JOptionPane.showMessageDialog(null, valores);
    }       
} //fim da classe Lista
