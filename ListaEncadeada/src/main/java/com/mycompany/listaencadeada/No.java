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
public class No {
    int valor; // Armazena o valor inteiro do nó
    No prox; // Referência para o próximo nó na lista

    /**
     * Construtor para criar um nó com um valor específico.
     * Inicializa o próximo nó como null.
     * @param v O valor a ser armazenado no nó.
     */
    public No(int v){
        valor = v; // Atribui o valor ao nó
        prox = null; // Inicializa o próximo nó como null (padrão para o último nó)
    }
} // Fim da classe No