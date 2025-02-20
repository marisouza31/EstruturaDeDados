/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizza;

/**
 *
 * @author FATEC ZONA LESTE
 */
    public class Principal {
        public static void main(String [] args){
        pizza p1 = new pizza("mussarela", 30.00);
        pizza p2 = new pizza("marguerita", 50.00);
        pizza p3 = new pizza("portuguesa", 60.00);
        pizza p4 = new pizza("napolitana", 70.00);
        pizza p5 = new pizza("calabresa", 80.00);

        bebida b1 = new bebida("coca-cola", 12.00);
        bebida b2 = new bebida("sprite", 10.00);
        
        carrinhoDeCompras c1 = new carrinhoDeCompras();
        
        c1.adicionaPizza(p1);
        c1.adicionaPizza(p2);
        c1.adicionaPizza(p3);
        c1.adicionaPizza(p4);
        c1.adicionaPizza(p5);
        c1.adicionaBebida(b1);
        c1.adicionaBebida(b2);
        
        
        System.out.println("Total a pagar = " + c1.getTotalPagar());
    }
}
