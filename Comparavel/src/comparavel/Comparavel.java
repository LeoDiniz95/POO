/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparavel;

/**
 *
 * @author 0040481422033
 */
public class Comparavel {

    int valorInteiro;
    
    public Comparavel() {
    }

    public Comparavel(int valorInteiro) {
        this.valorInteiro = valorInteiro;
    }
    
    public boolean eMaiorOuIgual(int vvalorInteiro){
        
        if( valorInteiro >= vvalorInteiro)
        {
            System.out.println("Maior ou igual");
            return true;
        }
        else
            return false;
    }
    
    public boolean eMenorOuIgual(int vvalorInteiro){
        
        if( valorInteiro <= vvalorInteiro)
        {
            System.out.println("Menor ou igual");
            return true;
        }
        else
            return false;
    }
    
    public boolean eDiferente(int vvalorInteiro){
        
        if( valorInteiro != vvalorInteiro)
        {
            System.out.println("Diferente");
            return true;
        }
        else
            return false;
    }
    
}
