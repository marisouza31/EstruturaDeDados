/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author reido
 */
public class Pessoa { 
    private Integer id; // Identificador único da pessoa
    private String nome; // Nome da pessoa
    private String email; // Email da pessoa

    /**
     * Construtor padrão que cria uma pessoa sem valores iniciais.
     */
    public Pessoa() { 
    } 

    /**
     * Construtor que cria uma pessoa com id, nome e email.
     * @param id Identificador único da pessoa.
     * @param nome Nome da pessoa.
     * @param email Email da pessoa.
     */
    public Pessoa(Integer id, String nome, String email) { 
        this.id = id; 
        this.nome = nome; 
        this.email = email; 
    } 

    /**
     * Obtém o id da pessoa.
     * @return O id da pessoa.
     */
    public Integer getId() { 
        return id; 
    } 

    /**
     * Define o id da pessoa.
     * @param id O id a ser atribuído à pessoa.
     */
    public void setId(Integer id) { 
        this.id = id; 
    } 

    /**
     * Obtém o nome da pessoa.
     * @return O nome da pessoa.
     */
    public String getNome() { 
        return nome; 
    } 

    /**
     * Define o nome da pessoa.
     * @param nome O nome a ser atribuído à pessoa.
     */
    public void setNome(String nome) { 
        this.nome = nome; 
    } 

    /**
     * Obtém o email da pessoa.
     * @return O email da pessoa.
     */
    public String getEmail() { 
        return email; 
    } 

    /**
     * Define o email da pessoa.
     * @param email O email a ser atribuído à pessoa.
     */
    public void setEmail(String email) { 
        this.email = email; 
    } 

    /**
     * Representação em string dos dados da pessoa.
     * @return Uma string com os dados da pessoa.
     */
    @Override 
    public String toString() { 
        return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]"; 
    } 
}
