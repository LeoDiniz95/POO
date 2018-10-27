/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

import javax.swing.JOptionPane;

/**
 *
 * @author 0040481422033
 */
public class Excecoes {
    
    public static void main(String[] args) {
        System.out.println("inicio do main");
        //metodo1();
        
        int dividendo, divisor;
        
        while(true){
            try{
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
                divide(dividendo,divisor);
                break;
            }
            catch(ArithmeticException e1){
                JOptionPane.showMessageDialog(null,"Não pode dividir por zero!");
            }
            catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null,"Favor informar apenas números inteiros!");}
        }
        
        System.out.println("fim do main");
    }
    
    static void divide( int dividendo, int divisor){
        JOptionPane.showMessageDialog(null,"Resultado da divisão: "+(dividendo/divisor));
    }
    
    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }
    
    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        
        try{
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro: " + e);
        }
        
        System.out.println("fim do metodo2");
    }
    
}
