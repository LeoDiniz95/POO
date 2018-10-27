/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0040481422033
 */
public class main {
    
    public static void main(String args[]){
        
        CalculoIMC calc = new CalculoIMC( 75, 1.80);
        
        /** Scanner ler = new Scanner(System.in);
        *   System.out.println("Digite a sua altura: ");
        *   calc.altura = ler.nextDouble();
        *   System.out.println("Digite o seu peso:");
        *   calc.peso = ler.nextDouble(); **/
        
        calc.Calculo();
    }
    
}
