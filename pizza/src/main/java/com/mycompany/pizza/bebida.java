/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizza;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class bebida {
    private String sabor;
    private double preco;
    
    bebida(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public String getSabor(){
        return sabor;
    }
}
