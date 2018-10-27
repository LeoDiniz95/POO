/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author 0040481422033
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora calc1 = new Calculadora( 5, 3, '+');
        Calculadora calc2 = new Calculadora( 2, 0, '/');
        
        System.out.println(calc1.CalculandoOperacoes());
        System.out.println(calc2.CalculandoOperacoes());
        
    }
    
}
