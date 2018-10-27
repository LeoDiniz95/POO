/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *
 * @author 0040481422033
 */
public class LampadaTresEstados extends Lampada{

    public LampadaTresEstados() {
    }
    
    public void Apagada(){
        estaLigada(false);
    }
    
    public void Acesa(){
        estaLigada(true);
    }
    
    public void MeiaLuz(){
        System.out.println("Meia-luz");
    }
    
}
