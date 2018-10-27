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
public class Circulo implements AreaCalculavel{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea() {
        return Math.PI*raio*raio;
    }
    
}
