/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaencadeada;

/**
 *
 * @author reido
 */
 public class ListaEncadeada { 
    private Celula primeiro; // Aponta para o primeiro elemento da lista
    private Celula ultimo;   // Aponta para o último elemento da lista
    private Celula posicaoAtual; // Usado para percorrer a lista

    /** 
     * Adiciona uma pessoa no fim da lista. 
     * @param valor Objeto do tipo Pessoa a ser adicionado à lista
     */ 
    public void adicionar(Pessoa valor) { 
        Celula celula = new Celula(); // Cria uma nova célula para armazenar o valor
        celula.setValor(valor); 

        if (primeiro == null && ultimo == null) { // Se a lista estiver vazia
            primeiro = celula; // Define a nova célula como primeiro elemento
            ultimo = celula;   // Define a nova célula como último elemento
        } else { 
            ultimo.setProximo(celula); // Liga o último elemento ao novo
            ultimo = celula; // Atualiza o ponteiro do último elemento
        } 
    } 

    /** 
     * Remove uma pessoa do fim da lista. 
     * Caso a lista tenha apenas um elemento, ela será esvaziada.
     */ 
    public void remover() { 
        if (primeiro.getProximo() != null) { // Se houver mais de um elemento na lista
            Celula celula = this.recuperarPenultimo(this.primeiro); // Obtém o penúltimo elemento
            ultimo = celula; // Atualiza o último elemento para ser o penúltimo
            celula.setProximo(null); // Remove a referência para o último nó
        } else { 
            primeiro = ultimo = null; // Se houver apenas um elemento, esvazia a lista
        } 
    } 

    /** 
     * Recupera o penúltimo elemento da lista de forma recursiva.
     * @param celula Célula atual sendo analisada
     * @return A célula que antecede a última célula da lista
     */ 
    private Celula recuperarPenultimo(Celula celula) { 
        if (celula.getProximo().equals(ultimo)) { // Se o próximo for o último
            return celula; // Retorna a célula atual, que é a penúltima
        } 
        return recuperarPenultimo(celula.getProximo()); // Chamada recursiva
    } 

    /** 
     * Verifica se há um próximo elemento na lista durante a iteração.
     * @return true se houver um próximo elemento, false caso contrário.
     */ 
    public boolean temProximo() { 
        if (primeiro == null) { // Se a lista estiver vazia, não há próximo
            return false; 
        } else if (posicaoAtual == null) { // Se for a primeira iteração, começa do primeiro elemento
            posicaoAtual = primeiro; 
            return true; 
        } else { 
            boolean temProximo = posicaoAtual.getProximo() != null; // Verifica se há um próximo
            posicaoAtual = posicaoAtual.getProximo(); // Avança para o próximo elemento
            return temProximo; 
        } 
    } 

    /** 
     * Obtém a célula na posição atual da iteração.
     * @return A célula atual
     */ 
    public Celula getPosicaoAtual() { 
        return this.posicaoAtual; 
    } 

    /** 
     * Método principal para testar a criação da lista encadeada.
     */ 
    public static void main(String[] args) { 
        ListaEncadeada lista = new ListaEncadeada(); 
        System.out.println("Lista Encadeada criada com sucesso!"); 
    }
}