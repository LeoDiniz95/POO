/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author 0040481422033
 */
public class Teste {
    
    public static void main(String[] args) {
        
        AreaCalculavel a = new Retangulo(3,2);
        AreaCalculavel b = new Circulo(9);
        AreaCalculavel c = new Quadrado(5);
        
        System.out.println(a.calculaArea());
        System.out.println(b.calculaArea());
        System.out.println(c.calculaArea());
        
    }
    
}
