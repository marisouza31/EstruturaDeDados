/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizza;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class carrinhoDeCompras {
    private double frete = 0;
    private double total_a_pagar = 0;
    
    MinhaPrimeiraED carrinho = new MinhaPrimeiraED();
    
    public void adicionaBebida (bebida item){
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }
    public void adicionaPizza(pizza item){
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }
    public double getTotalPagar(){
        return total_a_pagar;  
    }
}
