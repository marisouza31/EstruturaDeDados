/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author reido
 */
public class ListaEncadeadaSimples {
    
    public static void main(String[] args) {
        // Cria uma nova instância da lista
        Lista l = new Lista();

        // Insere novos nós no final da lista
        l.inserirNoFim(new No(2));  // Insere o nó com valor 2
        l.inserirNoFim(new No(12)); // Insere o nó com valor 12
        l.inserirNoInicio(new No(22)); // Insere o nó com valor 22 no início da lista
        l.inserirNoFim(new No(32)); // Insere o nó com valor 32 no final
        l.inserirNoFim(new No(2));  // Insere outro nó com valor 2 no final

        // Exibe a lista após as inserções
        l.exibirLista();  // A lista agora contém os valores: 22-2-12-32-2

        // Exclui o nó com valor 12 da lista
        l.excluirNo(new No(12));

        // Exibe a lista após a exclusão do nó com valor 12
        l.exibirLista();  // A lista agora contém os valores: 22-2-32-2
    } 

} // Fim da classe ListaEncadeadaSimples