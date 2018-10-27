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
public class Lampada {
    String tipo;
    String marca;
    double preco, potencia;

    public Lampada() {
    }

    public Lampada(String tipo, String marca, double preco, double watts) {
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
        this.potencia = watts;
    }

    
    /*********************************
     *            SETTERS           *
    *********************************/
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    
    /*********************************
     *            GETTERS           *
    *********************************/
    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public double getPotencia() {
        return potencia;
    }
    
    /************************************
    *    DIZ SE A LAMPÂDA ESTÁ LIGADA   *
    ************************************/
    public boolean estaLigada(boolean estado){
        if(estado != true ){
            System.out.println("Apagada");
        }
        else {
            System.out.println("Acesa");
        }
        
        return estado;
    }
    
    
    
}
