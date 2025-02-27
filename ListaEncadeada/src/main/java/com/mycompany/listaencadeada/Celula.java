/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author reido
 */
 public class Celula { 
    private Celula proximo; // Referência para a próxima célula na lista
    private Pessoa valor;   // Objeto do tipo Pessoa armazenado na célula

    /**
     * Obtém a próxima célula na lista encadeada.
     * @return A próxima célula
     */
    public Celula getProximo() { 
        return proximo; 
    } 

    /**
     * Define a próxima célula na lista encadeada.
     * @param proximo A célula que será a próxima na sequência
     */
    public void setProximo(Celula proximo) { 
        this.proximo = proximo; 
    } 

    /**
     * Obtém o valor armazenado na célula.
     * @return O objeto Pessoa contido na célula
     */
    public Pessoa getValor() { 
        return valor; 
    } 

    /**
     * Define o valor armazenado na célula.
     * @param valor O objeto Pessoa a ser armazenado
     */
    public void setValor(Pessoa valor) { 
        this.valor = valor; 
    } 
}