/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

import java.util.Random;

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
        Random random = new Random();
        int numeroRandom = (random.nextInt()% 2)+1;
        
        LampadaTresEstados lampada = new LampadaTresEstados();
        lampada.tipo    = "Led";
        lampada.marca   = "Heil Vaca";
        lampada.preco   = 16.90;
        lampada.potencia   = 225.5;
        
        System.out.println("Marca: "+lampada.marca 
                +"\nTipo: "+ lampada.tipo + "\nPreco: "+lampada.preco
                +"\nWatts: "+lampada.potencia);
        
        
        switch(numeroRandom){
            case 1:
                lampada.Apagada();
                break;
            case 2:
                lampada.MeiaLuz();
                break;
            default:
                lampada.Acesa();
                break;
        }
        
    }
    
}
